package _chapter02.discountpolicy;

import _chapter02.Money;
import _chapter02.Screening;
import _chapter02.discountcondition.DiscountCondition;
import lombok.Builder;

/**
 * @author : iyeong-gyo
 * @package : _chapter02
 * @since : 2022/03/01
 */
public class PercentDiscountPolicy extends DefaultDiscountPolicy {

  private double percent;

  @Builder
  public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
    super(conditions);
    this.percent = percent;
  }

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return screening.getMovieFee().times(percent);
  }
}
