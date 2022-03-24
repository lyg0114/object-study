package _chapter05.condition;

import _chapter05.Screening;
import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * @author : iyeong-gyo
 * @package : _chapter05.condition
 * @since : 2022/03/24
 */
public class PeriodCondition {

  private DayOfWeek dayOfWeek;
  private LocalTime startTime;
  private LocalTime endTime;

  public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
    this.dayOfWeek = dayOfWeek;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  private boolean isSatisfiedBy(Screening screening) {
    return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
        startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
        endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
  }
}
