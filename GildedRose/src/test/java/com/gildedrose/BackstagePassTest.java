package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BackstagePassTest {

  @Test
  void moreThan10BeforeQualityIncreasesBy1() {
    int sellIn = 11;
    int quality = 1;
    BackstagePass pass = new BackstagePass(sellIn, quality);
    pass.updateQuality();

    assertThat(pass.sellIn, equalTo(10));
    assertThat(pass.quality, equalTo(2));
  }

  @Test
  void qualityNeverExceeds50() {
    int sellIn = 11;
    int quality = 50;
    BackstagePass pass = new BackstagePass(sellIn, quality);
    pass.updateQuality();

    assertThat(pass.sellIn, equalTo(10));
    assertThat(pass.quality, equalTo(50));
  }

  @Test
  void with10DaysBeforeSellInQualityIncreasesBy2() {
    int sellIn = 10;
    int quality = 4;
    BackstagePass pass = new BackstagePass(sellIn, quality);
    pass.updateQuality();

    assertThat(pass.sellIn, equalTo(9));
    assertThat(pass.quality, equalTo(6));
  }

  @Test
  void with5DaysBeforeSellInQualityIncreasesBy3() {
    int sellIn = 5;
    int quality = 4;
    BackstagePass pass = new BackstagePass(sellIn, quality);
    pass.updateQuality();

    assertThat(pass.sellIn, equalTo(4));
    assertThat(pass.quality, equalTo(7));
  }

  @Test
  void afterConcertQualityIs0() {
    int sellIn = 0;
    int quality = 4;
    BackstagePass pass = new BackstagePass(sellIn, quality);
    pass.updateQuality();

    assertThat(pass.sellIn, equalTo(-1));
    assertThat(pass.quality, equalTo(0));
  }

}
