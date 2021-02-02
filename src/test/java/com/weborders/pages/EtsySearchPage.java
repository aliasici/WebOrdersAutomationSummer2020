package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPage {

    // Always here creating first constructor

    public EtsySearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "search_query")
    public WebElement searchBox;

    ////header/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]
    //(//button[@type='submit'])[1]
    @FindBy(xpath = "//header/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]")
    public WebElement serchButton;
}
