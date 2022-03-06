package _chapter02;

import _chapter02.discountpolicy.DiscountPolicy;
import javafx.util.Duration;
import lombok.Builder;
import lombok.Data;

/**
 * @author : iyeong-gyo
 * @package : _chapter02
 * @since : 2022/02/28
 */
@Data
public class Movie {

  private String title;
  private Duration runningTime;
  private Money fee;
  private DiscountPolicy discountPolicy;

  @Builder
  public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
    this.title = title;
    this.runningTime = runningTime;
    this.fee = fee;
    this.discountPolicy = discountPolicy;
  }

  public Money getFee() {
    return fee;
  }

  public Money calculateMovieFee(Screening screening) {
    return fee.minus(discountPolicy.calculateDiscountAmount(screening));
  }

  public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
    this.discountPolicy = discountPolicy;
  }
}
