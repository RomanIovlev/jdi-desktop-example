package org.mytests.tests.example;

import com.epam.jdi.uitests.core.logger.LogLevels;
import com.epam.jdi.uitests.win.testing.testRunner.TestNGBase;
import com.epam.jdi.uitests.win.winnium.elements.composite.DesktopApplication;
import org.mytests.uiobjects.example.site.JDIDesktop;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;

public class SimpleTestsInit extends TestNGBase {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() throws IOException {
        /*DesktopApplication.init(JDIDesktop.class);
        logger.setLogLevel(LogLevels.STEP);
        logger.info("Run Tests");*/
    }
}
