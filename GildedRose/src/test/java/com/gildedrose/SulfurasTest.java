package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SulfurasTest {

  @Test
  void sulfurasSellInNeverDecreases() {
    int sellIn = 0;
    Sulfuras sulfuras = new Sulfuras(sellIn, 80);
    sulfuras.updateQuality();

    assertThat(sulfuras.sellIn, equalTo(sellIn));
  }

  @Test
  void sulfurasQualityNeverDecreases() {
    int quality = 80;
    Sulfuras sulfuras = new Sulfuras(0, quality);
    sulfuras.updateQuality();

    assertThat(sulfuras.quality, equalTo(quality));
  }
}
