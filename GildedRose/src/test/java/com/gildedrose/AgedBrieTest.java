package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AgedBrieTest {

  @Test
  void qualityIncreasesAsSellInDayApproaches() {
    int sellIn = 2;
    int quality = 0;
    AgedBrie brie = new AgedBrie(sellIn, quality);
    brie.updateQuality();

    assertThat(brie.sellIn, equalTo(1));
    assertThat(brie.quality, equalTo(1));
  }

  @Test
  void maximumQualityIs50() {
    int sellIn = 2;
    int quality = 50;
    AgedBrie brie = new AgedBrie(sellIn, quality);
    brie.updateQuality();

    assertThat(brie.sellIn, equalTo(1));
    assertThat(brie.quality, equalTo(quality));
  }

  @Test
  void maximumQualityAfterSellByIs50() {
    int sellIn = -1;
    int quality = 49;
    AgedBrie brie = new AgedBrie(sellIn, quality);
    brie.updateQuality();

    assertThat(brie.sellIn, equalTo(-2));
    assertThat(brie.quality, equalTo(50));
  }

  @Test
  void qualityIncreasesBy2AfterSellDate() {
    int sellIn = 0;
    int quality = 2;
    AgedBrie brie = new AgedBrie(sellIn, quality);
    brie.updateQuality();

    assertThat(brie.sellIn, equalTo(-1));
    assertThat(brie.quality, equalTo(4));
  }
}
