package _chapter05;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * @author : iyeong-gyo
 * @package : _chapter05
 * @since : 2022/03/17
 */
@Data
public class Screening {

  private Movie movie;
  private int sequence;
  private LocalDateTime whenScreened;

  public Reservation reserve(Customer customer, int audienceCount) {
    return null;
  }

  private Money calculateFee(int audienceCount){
    return movie.calculateMovieFee(this).times(audienceCount);
  }

}
