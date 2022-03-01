package _chapter02.discountpolicy;

import _chapter02.Money;
import _chapter02.Screening;
import _chapter02.discountcondition.DiscountCondition;

/**
 * @author : iyeong-gyo
 * @package : _chapter02
 * @since : 2022/03/01
 */
public class AmountDiscountPolicy extends DiscountPolicy {

  private Money discountAmount;

  public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
    super(conditions);
    this.discountAmount = discountAmount;
  }

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return discountAmount;
  }
}
