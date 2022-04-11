package pages.levelKitchen.header;

import locators.levelKitchen.home.Regions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Page;
import pages.SectionAble;

import static locators.levelKitchen.home.Regions.*;

public class RegionsSection extends Page implements SectionAble {
    public RegionsSection(WebDriver driver) {
        super(driver);
    }

    @Override
    public SectionAble gotoSection() {
        return null;
    }


    public RegionsSection preSelectRegion(boolean choice) {

        log("Подтвердить текущий регион");
        driver.findElement(By.xpath(REGION_APPROVE_YES.getLocator())).click();

        return this;
    }

    public RegionsSection selectRegion(String regionName) {

        log("Открыть меню Регионы");
        driver.findElement(By.xpath(REGION_SELECTOR.getLocator())).click();

        pause(2);

        log("Выбрать регион " + regionName);
        driver.findElement(By.xpath(REGION.getLocator(regionName))).click();

        pause(2);

        return this;
    }

    public boolean checkSelectedRegion() {
        return false;
    }

    @Override
    public String pageTitle() {
        return null;
    }

    @Override
    public boolean openPage() {
        return false;
    }


}
