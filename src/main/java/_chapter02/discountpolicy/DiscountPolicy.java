package _chapter02.discountpolicy;

import _chapter02.Money;
import _chapter02.Screening;
import _chapter02.discountcondition.DiscountCondition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : iyeong-gyo
 * @package : _chapter02
 * @since : 2022/03/01
 */
public abstract class DiscountPolicy {

  private List<DiscountCondition> conditions = new ArrayList<>();

  public DiscountPolicy(DiscountCondition... conditions) {
    this.conditions = Arrays.asList(conditions);
  }

  public Money calculateDiscountAmount(Screening screening) {
    for (DiscountCondition each : conditions) {
      if (each.isSatisfiedBy(screening)) {
        return getDiscountAmount(screening);
      }
    }
    return Money.ZERO;
  }

  abstract protected Money getDiscountAmount(Screening screening);
}
