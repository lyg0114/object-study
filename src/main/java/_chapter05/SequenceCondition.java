package _chapter05;

/**
 * @author : iyeong-gyo
 * @package : _chapter05
 * @since : 2022/03/17
 */
public class SequenceCondition {

  private int sequence;

  public SequenceCondition(int sequence) {
    this.sequence = sequence;
  }

  public boolean isSatisfiedBy(Screening screening) {
    return  sequence == screening.getSequence();
  }
}
