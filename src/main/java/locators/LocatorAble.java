package locators;

public interface LocatorAble {

    /**
     * convert simple xpath locator to css selector.
     * Examples:
     * //a[contains(text(),'RRRR') and contains(@onclick, 'TesT')]                        => css=a:contains('RRRR')[onclick*='TesT']
     * //a[@id='II' or @name='NNNN']                                                      => css=a[id='II'],[name='NNNN']
     * //a[contains(@href, '9.0/t/pt/S.epage?sp=Uop67jrg0000imd1qb9bg000000')]            => css=a[href*='9.0/t/pt/S.epage?sp=Uop67jrg0000imd1qb9bg000000']
     * //div[@id='BrowseMenu']//a[contains(@href, 'WorkTree.page')]                       => css=div[id='BrowseMenu'] a[href*='WorkTree.page']
     * //div[@id='AdminMenu']//a[contains(@href, 'DefinePermissions')]                    => css=div[id='AdminMenu'] a[href*='DefinePermissions']
     * //div[@class='xxx']//tag[@id='yyy']//*[@style='zzz']                               => css=div[class='xxx'] tag[id='yyy'] [style='zzz']
     * //div[@class='xxx X X.X']/a[@href="www.ru'.test'"]                                 => css=div[class='xxx X X.X'] > a[href="www.ru'.test'"]
     * //div//a                                                                           => css=div a
     * //div[@id='intro']//a[contains(@class, 'active')]/*[contains(@class,'test')]       => css=div[id='intro'] a[class*='active'] > [class*='test']
     * //*[@id='apple']//pear[contains(@class, 'lemon')]                                  => css=[id='apple'] pear[class*='lemon']
     * //ul[contains(@class, 'nav')]//li[1]//a                                            => css=ul[class*='nav'] li a
     * //body/div/p[3]                                                                    => css=body > div > p:nth-child(3)
     * //li/input[@type='text']                                                           => css=li > input[type='text']
     **/

    String getLocator();

    String getLocator(String element);

    String PS_ID = "PS_ID";
    String USER_ID = "USER_ID";
    String SS = "{}";
    String CC = "[]";
    String PS_NAME = "PS_NAME";


}
