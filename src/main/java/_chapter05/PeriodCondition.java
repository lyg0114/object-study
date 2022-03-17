package _chapter05;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * @author : iyeong-gyo
 * @package : _chapter05
 * @since : 2022/03/17
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

  public boolean isSatisfiedBy(Screening screening) {
    return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
        startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
        endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
  }
}
