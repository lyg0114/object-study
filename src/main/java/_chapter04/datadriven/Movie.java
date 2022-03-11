package _chapter04.datadriven;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import javafx.util.Duration;

/**
 * @author : iyeong-gyo
 * @package : _chapter04
 * @since : 2022/03/10
 */
public class Movie {

  private String title;
  private Duration runningTime;
  private Money fee;
  private List<DiscountCondition> discountConditions;

  private MovieType movieType;
  private Money discountAmount;
  private double discountPercent;

  public Money calculateAmountDiscountedFee() {
    if (movieType != MovieType.AMOUNT_DISCOUNT) {
      throw new IllegalArgumentException();
    }
    return fee.minus(discountAmount);
  }

  public Money calculatePercentDiscountedFee() {
    if (movieType != MovieType.PERCENT_DISCOUNT) {
      throw new IllegalArgumentException();
    }
    return fee.minus(fee.times(discountPercent));
  }

  public Money calculateNoneDiscountedFee() {
    if (movieType != MovieType.PERCENT_DISCOUNT) {
      throw new IllegalArgumentException();
    }
    return fee;
  }

  public boolean isDiscountable(LocalDateTime wheenScreened, int sequence) {
    for (DiscountCondition condition : discountConditions) {
      if (condition.getType() == DiscountConditionType.PERIOD) {
        if(condition.isDiscountable(wheenScreened.getDayOfWeek(), wheenScreened.toLocalTime())){
          return true;
        }
      }
      else{
        if(condition.isDiscountable(sequence)){
          return true;
        }
      }
    }
    return false;
  }

  public void setMovieType(MovieType movieType) {
    this.movieType = movieType;
  }

  public Money getFee() {
    return fee;
  }

  public void setFee(Money fee) {
    this.fee = fee;
  }

  public List<DiscountCondition> getDiscountConditions() {
    return Collections.unmodifiableList(discountConditions);
  }

  public MovieType getMovieType() {
    return movieType;
  }

  public Money getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Money discountAmount) {
    this.discountAmount = discountAmount;
  }

  public void setDiscountPercent(double discountPercent) {
    this.discountPercent = discountPercent;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Duration getRunningTime() {
    return runningTime;
  }

  public void setRunningTime(Duration runningTime) {
    this.runningTime = runningTime;
  }

  public void setDiscountConditions(List<DiscountCondition> discountConditions) {
    this.discountConditions = discountConditions;
  }

  public double getDiscountPercent() {
    return discountPercent;
  }
}
