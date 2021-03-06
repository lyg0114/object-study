package _chapter05;

import _chapter05.condition.DiscountCondition;
import java.util.List;
import javafx.util.Duration;

/**
 * @author : iyeong-gyo
 * @package : _chapter05
 * @since : 2022/03/17
 */
public class Movie {

  private String title;
  private Duration runningTime;
  private Money fee;
  private List<DiscountCondition> discountConditions;

  private MovieType movieType;
  private Money discountAmount;
  private double discountPercent;

  public Money calculateMovieFee(Screening screening) {
    if (isDiscountable(screening)) {
      return fee.minus(calculateDiscountAmount());
    }
    return fee;
  }

  private Money calculateDiscountAmount() {
    switch (movieType) {
      case AMOUNT_DISCOUNT:
        return calculateAmountDiscountAmount();
      case PERCENT_DISCOUNT:
        return calculatePercentDiscountAmount();
      case NONE_DISCOUNT:
        return calculateNoneDiscountAmount();
    }
    throw new IllegalStateException();
  }

  private Money calculateNoneDiscountAmount() {
    return Money.ZERO;
  }

  private Money calculatePercentDiscountAmount() {
    return fee.times(discountPercent);
  }

  private Money calculateAmountDiscountAmount() {
    return discountAmount;
  }

  private boolean isDiscountable(Screening screening) {
    return discountConditions.stream()
        .anyMatch(condition -> condition.isSatisfiedBy(screening));
  }
}
