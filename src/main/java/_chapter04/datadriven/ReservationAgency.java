package _chapter04.datadriven;

/**
 * @author : iyeong-gyo
 * @package : _chapter04
 * @since : 2022/03/11
 */
public class ReservationAgency {
  public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
    Money fee = screening.calculateFee(audienceCount);
    return new Reservation(customer, screening, fee, audienceCount);
  }
}
