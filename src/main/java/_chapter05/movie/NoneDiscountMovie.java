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
public class NoneDiscountMovie extends Movie {

  public NoneDiscountMovie(String title, Duration runningTime, Money fee,
      List<DiscountCondition> discountConditions) {
    super(title, runningTime, fee, discountConditions);
  }

  @Override
  protected Money calculateDiscountAmount() {
    return Money.ZERO;
  }
}
