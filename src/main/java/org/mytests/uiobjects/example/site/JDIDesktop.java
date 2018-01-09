package org.mytests.uiobjects.example.site;

import org.mytests.uiobjects.example.site.pages.ContactPage;
import org.mytests.uiobjects.example.site.pages.DatesPage;
import org.mytests.uiobjects.example.site.sections.LeftMenu;
import org.openqa.selenium.support.FindBy;

//@JSite("https://epam.github.io/JDI")
public class JDIDesktop {
    public static ContactPage contactPage;
    public static DatesPage datesPage;
    @FindBy(id = "tabControl") public static LeftMenu leftMenu;

}
