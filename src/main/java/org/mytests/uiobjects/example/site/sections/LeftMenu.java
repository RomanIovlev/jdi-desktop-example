package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.uitests.win.winnium.elements.common.Button;
import com.epam.jdi.uitests.win.winnium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 1/9/2018.
 */
public class LeftMenu extends Section {
    @FindBy(id = "homeTab") public Button home;
    @FindBy(id = "contactFormTab") public Button contacts;
    @FindBy(id = "supportTab") public Button support;
    @FindBy(id = "datesTab") public Button dates;
    @FindBy(id = "complexTab") public Button complexTable;
    @FindBy(id = "simpleTab") public Button simpleTable;
    @FindBy(id = "pagedTab") public Button tableWithPages;
    @FindBy(id = "differentTab") public Button differentElements;
    @FindBy(id = "metalsTab") public Button metalsAndColors;
}
