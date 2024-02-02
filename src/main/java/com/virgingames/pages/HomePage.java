package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Necessary cookies only']")
    WebElement cookies;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Join Now']")
    WebElement joinNowTab;

    @CacheLookup
    @FindBy(linkText = "Online Slots")
    WebElement onlineSlotsTab;

    @CacheLookup
    @FindBy(xpath = "//li[@class='StyledNavigationMenuListItem-sc-v46bks-2 hRASAg']/a/span")
    List<WebElement> topMenu;

    public String getTitle() {
        log.info("get the title of the page ");
        return driver.getTitle();
    }

    public void clickOnNecessarycookies() {
        clickOnElement(cookies);
        log.info("click on cookies " + cookies.toString());
    }

    public void clickOnJoinNowTab() {
        clickOnElement(joinNowTab);
        log.info("click on JoinNow Tab " + joinNowTab.toString());
    }

    public void selectTopMenu(String tab) {
        for (WebElement menu : topMenu) {
            if (menu.getText().equals(tab)) {
                clickOnElement(menu);
                break;
            }
        }
        log.info("Click on Online Slots tab " + topMenu.toString());
    }
}