package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item instanceof UpdatableItem) {
                ((UpdatableItem) item).updateQuality();
                continue;
            }

            if (!item.name.equals(AgedBrie.AGED_BRIE) && !item.name.equals(BackstagePass.NAME)) {
                if (item.quality > 0) {
                    item.quality--;
                }
            } else {
                if (item.quality < 50) {
                    item.quality++;

                    if (item.name.equals(BackstagePass.NAME)) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                item.quality++;
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality++;
                            }
                        }
                    }
                }
            }

            item.sellIn--;

            if (item.sellIn < 0) {
                if (!item.name.equals(AgedBrie.AGED_BRIE)) {
                    if (!item.name.equals(BackstagePass.NAME)) {
                        if (item.quality > 0) {
                            item.quality--;
                        }
                    } else {
                        item.quality = 0;
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality++;
                    }
                }
            }
        }
    }
}
