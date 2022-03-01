package _chapter02;

/**
 * @author : iyeong-gyo
 * @package : _chapter02
 * @since : 2022/03/01
 */
public interface DiscountCondition {

  boolean isSatisfiedBy(Screening screening);
}
