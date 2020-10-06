package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AllegroCSSTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebElement alertBoxButton = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(8) > div > div._1yyhi > div > button"));
        alertBoxButton.click();

        WebElement category = driver.findElement(By.cssSelector("div > select"));
        Select choseCategory = new Select(category);
        choseCategory.selectByIndex(3);

        WebElement inputField = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(2) > header > div > div > div > div > form > input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

    }
}