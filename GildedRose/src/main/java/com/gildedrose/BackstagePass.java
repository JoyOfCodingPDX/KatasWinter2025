package com.gildedrose;

public class BackstagePass extends UpdatableItem {
  static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

  public BackstagePass(int sellIn, int quality) {
    super(NAME, sellIn, quality);
  }

  @Override
  public void updateQuality() {
    if (sellIn > 10) {
      incrementQuality();

    } else if (sellIn > 5) {
      incrementQuality();
      incrementQuality();

    } else if (sellIn > 0) {
      incrementQuality();
      incrementQuality();
      incrementQuality();

    } else {
      this.quality = 0;
    }

    this.sellIn--;
  }
}
