package _chapter02.discountcondition;

import _chapter02.Screening;

/**
 * @author : iyeong-gyo
 * @package : _chapter02
 * @since : 2022/03/01
 */
public interface DiscountCondition {

  boolean isSatisfiedBy(Screening screening);
}
