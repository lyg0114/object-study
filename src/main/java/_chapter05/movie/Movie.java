package _chapter05.movie;

import _chapter05.Money;
import _chapter05.Screening;
import _chapter05.condition.DiscountCondition;
import java.util.List;
import javafx.util.Duration;

/**
 * @author : iyeong-gyo
 * @package : _chapter05.movie
 * @since : 2022/03/24
 */
public abstract class Movie {

  private String title;
  private Duration runningTime;
  private Money fee;
  private List<DiscountCondition> discountConditions;

  public Movie(String title, Duration runningTime, Money fee,
      List<DiscountCondition> discountConditions) {
    this.title = title;
    this.runningTime = runningTime;
    this.fee = fee;
    this.discountConditions = discountConditions;
  }

  public Money calculateMovieFee(Screening screening) {
    if (isDiscountable(screening)) {
      return fee.minus(calculateDiscountAmount());
    }
    return fee;
  }

  private boolean isDiscountable(Screening screening) {
    return discountConditions.stream()
        .anyMatch(condition -> condition.isSatisfiedBy(screening));
  }

  protected abstract Money calculateDiscountAmount();


}
