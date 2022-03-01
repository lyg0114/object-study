package _chapter02;

/**
 * @author : iyeong-gyo
 * @package : _chapter02
 * @since : 2022/02/28
 */
public class Reservation {

  private Customer customer;
  private Screening screening;
  private Money fee;
  private int audienceCount;

  public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
    this.customer = customer;
    this.screening = screening;
    this.fee = fee;
    this.audienceCount = audienceCount;
  }
}
