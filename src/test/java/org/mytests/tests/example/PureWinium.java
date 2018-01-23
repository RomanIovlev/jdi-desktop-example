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

import static org.mytests.uiobjects.example.enums.Utils.killAllRunDrivers;

/**
 * Created by Roman_Iovlev on 1/9/2018.
 */
public class PureWinium {
    private Process proc;
    private WebDriver driver;
    private WebElement tab;

    private String CALC_PATH = "C:\\Windows\\System32\\calc.exe";
    private String WINIUM_PATH = "http://localhost:9999";

    @BeforeTest
    public void before() throws IOException {
        killAllRunDrivers();
        proc = new ProcessBuilder(getDriverPath()).start();
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath(CALC_PATH);
        driver = new WiniumDriver(new URL(WINIUM_PATH), options);
        //options.setApplicationPath(resourcesFolder() + "JDITestDesktopApp.exe");
        //options.setApplicationPath("D:\\temp\\JDI-winium2\\JDI-winium2\\TestApplications\\JDITestDesktopApp\\JDITestDesktopApp\\bin\\Debug\\JDITestDesktopApp.exe");
        //driver = new WiniumDriver(new URL("http://localhost:9999"), options);
        //tab = driver.findElement(By.id("JDITestDesktopApp")).findElement(By.id("tabControl"));

    }
    @Test
    public void winiumTest1() {
        driver.findElement(By.id("num7Button")).click();
        driver.findElement(By.id("num8Button")).click();
        driver.findElement(By.id("num3Button")).click();
        driver.findElement(By.id("DatesView")).click();
    }
    @Test
    public void winiumTest2() {
        driver.findElement(By.id("tabControl")).findElement(By.id("supportTab")).click();
        driver.findElement(By.id("tabControl")).findElement(By.id("datesTab")).click();
    }
    @Test
    public void winiumTabTest1() {
        tab.findElement(By.id("datesTab")).click();
        tab.findElement(By.id("supportTab")).click();
    }
    @Test
    public void winiumTabTest2() {
        tab.findElement(By.id("supportTab")).click();
        tab.findElement(By.id("datesTab")).click();
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
