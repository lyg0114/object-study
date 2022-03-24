package _chapter05;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * @author : iyeong-gyo
 * @package : _chapter05
 * @since : 2022/03/17
 */
public class DiscountCondition {

  private DiscountConditionType type;

  private DayOfWeek dayOfWeek;
  private LocalTime startTime;
  private LocalTime endTime;

  private int sequence;

  public boolean isSatisfiedBy(Screening screening) {
    if (type == DiscountConditionType.PERIOD) {
      return isSatisfiedByPeriod(screening);
    }

    return isSatisfiedBySequence(screening);
  }

  private boolean isSatisfiedByPeriod(Screening screening) {
    return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
        startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
        endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
  }

  private boolean isSatisfiedBySequence(Screening screening) {
    return sequence == screening.getSequence();
  }
}
