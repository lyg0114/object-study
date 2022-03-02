package _chapter02;

import _chapter02.discountcondition.DiscountCondition;
import _chapter02.discountcondition.PeriodCondition;
import _chapter02.discountcondition.SequenceCondition;
import _chapter02.discountpolicy.AmountDiscountPolicy;
import _chapter02.discountpolicy.PercentDiscountPolicy;
import java.time.DayOfWeek;
import java.time.LocalTime;
import javafx.util.Duration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author : iyeong-gyo
 * @package : _chapter02
 * @since : 2022/03/03
 */
public class Chapter02Test {

  Movie avater;
  Movie titanic;

  @BeforeEach
  public void beforeEach() {
    DiscountCondition[] discountConditions = getDiscountConditionsForAvater();

    avater = Movie.builder()
        .title("아바타")
        .runningTime(Duration.minutes(120))
        .fee(Money.wons(10000))
        .discountPolicy(
            new AmountDiscountPolicy(Money.wons(800), discountConditions)
        ).build();

    titanic = Movie.builder()
        .title("타이타닉")
        .runningTime(Duration.minutes(180))
        .fee(Money.wons(11000))
        .discountPolicy(
            PercentDiscountPolicy.builder()
                .percent(0.1)
                .conditions(getDiscountConditionsForTitanic())
                .build()
        ).build();

  }

  private DiscountCondition[] getDiscountConditionsForAvater() {
    DiscountCondition[] discountConditions = new DiscountCondition[4];
    discountConditions[0] = SequenceCondition.builder().sequence(1).build();
    discountConditions[1] = SequenceCondition.builder().sequence(10).build();
    discountConditions[2] = PeriodCondition.builder().dayOfWeek(DayOfWeek.THURSDAY)
        .startTime(LocalTime.of(10, 0))
        .endTime(LocalTime.of(11, 59))
        .build();
    discountConditions[3] = PeriodCondition.builder().dayOfWeek(DayOfWeek.THURSDAY)
        .startTime(LocalTime.of(10, 0))
        .endTime(LocalTime.of(20, 59))
        .build();
    return discountConditions;
  }

  private DiscountCondition[] getDiscountConditionsForTitanic() {
    DiscountCondition[] discountConditions = new DiscountCondition[4];
    discountConditions[0] = PeriodCondition.builder().dayOfWeek(DayOfWeek.THURSDAY)
        .startTime(LocalTime.of(14, 0))
        .endTime(LocalTime.of(16, 59))
        .build();
    discountConditions[1] = SequenceCondition.builder().sequence(2).build();
    discountConditions[2] = PeriodCondition.builder().dayOfWeek(DayOfWeek.THURSDAY)
        .startTime(LocalTime.of(14, 0))
        .endTime(LocalTime.of(16, 59))
        .build();
    return discountConditions;
  }

  @Test
  public void calculateDiscount() {
    System.out.println("avater = " + avater);
    System.out.println("titanic = " + titanic);
  }


}
