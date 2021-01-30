package com.weborders.practice;

import com.weborders.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDynamicWebElement {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = Driver.getDriver();

        driver.get("http://demo.guru99.com/test/web-table-element.php");

        String beforeXpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";
        String afterXpath = "]/td[1]/a";

        List<WebElement> totalRow = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
        List<WebElement> totalCol = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        int rowCount = totalRow.size();
        int colCount = totalCol.size();
        System.out.println(rowCount);

        for (int i = 1; i <= rowCount; i++){
            String CompanyXpath = beforeXpath +i+ afterXpath;

            WebElement companyName = driver.findElement(By.xpath(CompanyXpath));
            System.out.println(companyName.getText());

            if(companyName.getText().equals("UCO Bank")){
                System.out.println("Company name "+companyName.getText()+ " is found "+i+ "position");
                break;
            }
        }
        Assert.assertEquals(5,colCount);
        Assert.assertEquals(20,rowCount);
        Thread.sleep(3);
        driver.close();





    }


}
