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
public class PercentDiscountMovie extends Movie {

  private double percent;

  public PercentDiscountMovie(String title, Duration runningTime, Money fee,
      List<DiscountCondition> discountConditions, double percent) {
    super(title, runningTime, fee, discountConditions);
    this.percent = percent;
  }

  @Override
  protected Money calculateDiscountAmount() {
    return getFee().times(percent);
  }
}
