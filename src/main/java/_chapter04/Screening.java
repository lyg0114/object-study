package _chapter04;

import java.time.LocalDateTime;

/**
 * @author : iyeong-gyo
 * @package : _chapter04
 * @since : 2022/03/10
 */
public class Screening {

  private Movie movie;
  private int sequence;
  private LocalDateTime whenScreened;

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  public int getSequence() {
    return sequence;
  }

  public void setSequence(int sequence) {
    this.sequence = sequence;
  }

  public LocalDateTime getWhenScreened() {
    return whenScreened;
  }

  public void setWhenScreened(LocalDateTime whenScreened) {
    this.whenScreened = whenScreened;
  }
}
