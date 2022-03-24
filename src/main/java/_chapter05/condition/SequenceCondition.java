package _chapter05.condition;

import _chapter05.Screening;

/**
 * @author : iyeong-gyo
 * @package : _chapter05.condition
 * @since : 2022/03/24
 */
public class SequenceCondition {

  private int sequence;

  public SequenceCondition(int sequence) {
    this.sequence = sequence;
  }

  private boolean isSatisfiedBy(Screening screening) {
    return sequence == screening.getSequence();
  }
}
