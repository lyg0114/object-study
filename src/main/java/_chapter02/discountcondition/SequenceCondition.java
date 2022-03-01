package _chapter02.discountcondition;

import _chapter02.Screening;

/**
 * @author : iyeong-gyo
 * @package : _chapter02
 * @since : 2022/03/01
 */
public class SequenceCondition implements DiscountCondition {

  private int sequence;

  public SequenceCondition(int sequence) {
    this.sequence = sequence;
  }

  @Override
  public boolean isSatisfiedBy(Screening screening) {
    return screening.isSequence(sequence);
  }
}
