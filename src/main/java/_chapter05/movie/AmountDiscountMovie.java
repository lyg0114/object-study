package _chapter05.movie;

import _chapter05.Money;
import _chapter05.condition.DiscountCondition;
import java.util.List;
import javafx.util.Duration;

/**
 * @author : iyeong-gyo
 * @package : _chapter05.movie
 * @since : 2022/03/24
 */
public class AmountDiscountMovie extends Movie {

  private Money discountAmount;

  public AmountDiscountMovie(String title, Duration runningTime, Money fee,
      List<DiscountCondition> discountConditions,
      Money discountAmount) {
    super(title, runningTime, fee, discountConditions);
    this.discountAmount = discountAmount;
  }

  @Override
  protected Money calculateDiscountAmount() {
    return discountAmount;
  }
}
