package _chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : iyeong-gyo
 * @package : _chapter01
 * @since : 2022/02/27
 */
public class TicketOffice {
  private Long amount;
  private List<Ticket> tickets = new ArrayList<Ticket>();

  public TicketOffice(Long amount, Ticket... tickets) {
    this.amount = amount;
    this.tickets.addAll(Arrays.asList(tickets));
  }

  public Ticket getTicket() {
    return tickets.remove(0);
  }

  public void minusAmount(Long amount) {
    this.amount -= amount;
  }

  public void plusAmount(Long amount) {
    this.amount += amount;
  }
}
