package _chapter02.discountpolicy;

import _chapter02.Money;
import _chapter02.Screening;

/**
 * @author : iyeong-gyo
 * @package : _chapter02.discountpolicy
 * @since : 2022/03/03
 */
public interface DiscountPolicy {

  Money calculateDiscountAmount(Screening screening);

}
