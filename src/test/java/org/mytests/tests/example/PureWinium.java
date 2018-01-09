package org.mytests.tests.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Roman_Iovlev on 1/9/2018.
 */
public class PureWinium {
    private Process proc;
    private WebDriver driver;
    private WebElement tab;
    @BeforeTest
    public void before() throws IOException {
        proc = new ProcessBuilder(getDriverPath()).start();
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath(resourcesFolder() + "JDI_AUT.exe");
        driver = new WiniumDriver(new URL("http://localhost:9999"), options);
        tab = driver.findElement(By.id("tabControl"));

    }
    @Test
    public void winiumTest1() throws IOException {
        driver.findElement(By.id("tabControl")).findElement(By.id("datesTab")).click();
        driver.findElement(By.id("tabControl")).findElement(By.id("supportTab")).click();
    }
    @Test
    public void winiumTest2() throws IOException {
        driver.findElement(By.id("tabControl")).findElement(By.id("supportTab")).click();
        driver.findElement(By.id("tabControl")).findElement(By.id("datesTab")).click();
    }
    @Test
    public void winiumTabTest1() throws IOException {
        tab.findElement(By.id("datesTab")).click();
        tab.findElement(By.id("supportTab")).click();
    }
    @Test
    public void winiumTabTest2() throws IOException {
        tab.findElement(By.id("datesTab")).click();
        tab.findElement(By.id("supportTab")).click();
    }
    @AfterTest
    public void after() {
        proc.destroy();
    }
    private static String getDriverPath() {
        return resourcesFolder() + "Winium.Desktop.Driver.exe";
    }
    private static String resourcesFolder() {
        return new File("").getAbsolutePath() + "\\src\\main\\resources\\";
    }
}
