package _chapter01;

/**
 * @author : iyeong-gyo
 * @package : _chapter01
 * @since : 2022/02/27
 * replace
 */
public class Audience {

  private Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }

  public Bag getBag() {
    return bag;
  }

  public Long buy(Ticket ticket) {
    return bag.hold(ticket);
  }

}
