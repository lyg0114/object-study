package _chapter02.discountpolicy;

import _chapter02.Money;
import _chapter02.Screening;
import _chapter02.discountcondition.DiscountCondition;
import java.time.MonthDay;
import lombok.Builder;

/**
 * @author : iyeong-gyo
 * @package : _chapter02
 * @since : 2022/03/01
 */
@Builder
public class NoneDiscountPolicy implements DiscountPolicy {
  @Override
  public Money calculateDiscountAmount(Screening screening) {
    return Money.ZERO;
  }
}
