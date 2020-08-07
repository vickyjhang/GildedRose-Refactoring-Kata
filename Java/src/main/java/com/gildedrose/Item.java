package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void upgradeAgedBrie(GildedRose gildedRose) {
        sellIn = sellIn - 1;
        increaseQuality();
        if (sellIn < 0) {
            increaseQuality();
        }
    }

    public void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    public void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
