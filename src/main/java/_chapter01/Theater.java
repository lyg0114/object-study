package _chapter01;

/**
 * @author : iyeong-gyo
 * @package : _chapter01
 * @since : 2022/02/27
 */
public class Theater {
  private TicketSeller ticketSeller;

  public Theater(TicketSeller ticketSeller) {
    this.ticketSeller = ticketSeller;
  }

  public void enter(Audience audience) {
    ticketSeller.sellTo(audience);
  }
}
