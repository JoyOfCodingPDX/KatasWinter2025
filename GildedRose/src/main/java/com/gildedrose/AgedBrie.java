package com.gildedrose;

public class AgedBrie extends UpdatableItem {
  static final String AGED_BRIE = "Aged Brie";

  public AgedBrie(int sellIn, int quality) {
    super(AGED_BRIE, sellIn, quality);
  }

  @Override
  public void updateQuality() {
    this.sellIn--;

    incrementQuality();

    if (this.sellIn < 0) {
      incrementQuality();
    }

  }

}
