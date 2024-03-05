package org.example

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.annotations.Test

class TestOne{

    @Test
    fun openWebpage(){

        System.setProperty("webdriver.chrome.driver", "src/main/kotlin/org/example/drivers/chrome.exe")

        val driver: WebDriver = ChromeDriver() //immutable, give driver a type so code is readable

        val url: String = "http://www.google.com"

        driver.get(url); //open web page

        Assert.assertEquals(driver.currentUrl, url, "Url does not match!")

        driver.quit() // shut down driver

    }

}