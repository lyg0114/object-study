package _chapter05.condition;

import _chapter05.Screening;

/**
 * @author : iyeong-gyo
 * @package : _chapter05.condition
 * @since : 2022/03/24
 */
public interface DiscountCondition {
  boolean isSatisfiedBy(Screening screening);
}
