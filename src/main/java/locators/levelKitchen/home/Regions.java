package locators.levelKitchen.home;

import locators.LocatorAble;

public enum Regions implements LocatorAble {

    REGION_APPROVE_YES("//div[contains(@class,'pre-select-region__buttons')]//button//span"),
    REGION_SELECTOR("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]"),
    REGION("//div[@class=\"region-name\" and contains(text(),'" + SS + "')]");

    Regions(String locator) {
        this.locator = locator;
    }

    String locator;

    @Override
    public String getLocator() {
        return locator;
    }

    // Заменяет element на название региона

    public String getLocator(String element) {
        return this.getLocator().replace(SS, element);

    }
}
