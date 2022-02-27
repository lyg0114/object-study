package _chapter01;

/**
 * @author : iyeong-gyo
 * @package : _chapter01
 * @since : 2022/02/27
 */
public class TicketSeller {
  private TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public void sellTo(Audience audience) {
    ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
  }
}
