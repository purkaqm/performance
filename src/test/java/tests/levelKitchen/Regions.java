package tests.levelKitchen;

import org.testng.annotations.Test;
import tests.TestPage;
import pages.levelKitchen.header.*;

public class Regions extends TestPage {

    RegionsSection regionsSection;

    @Test(testName = "Выбор региона")
    public void testRegions() {


        regionsSection = new RegionsSection(driver);

        regionsSection.preSelectRegion(true).selectRegion("Краснодар")
                .selectRegion("Москва")
                .selectRegion("Екатеринбург")
                .selectRegion("Ярославль");


    }
}
