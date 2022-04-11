package locators;

public enum CommonLoc implements LocatorAble {
    CONTEXT_URL("");

    CommonLoc(String locator) {
        this.locator = locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    private String locator;


    public String getLocator() {
        return locator;
    }

    @Override
    public String getLocator(String element) {
        return locator;
    }
}
