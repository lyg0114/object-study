package _chapter02.discountcondition;

import _chapter02.Screening;
import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * @author : iyeong-gyo
 * @package : _chapter02
 * @since : 2022/03/01
 */
public class PeriodCondition implements DiscountCondition {

  private DayOfWeek dayOfWeek;
  private LocalTime startTime;
  private LocalTime endTime;

  public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
    this.dayOfWeek = dayOfWeek;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  @Override
  public boolean isSatisfiedBy(Screening screening) {
    return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
        startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
        endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
  }
}
