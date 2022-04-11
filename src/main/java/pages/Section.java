package pages;

import org.openqa.selenium.WebDriver;

public class Section extends Page implements SectionAble{

    public Section(WebDriver driver) {
        super(driver);
    }

    @Override
    public SectionAble gotoSection() {
        return null;
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
