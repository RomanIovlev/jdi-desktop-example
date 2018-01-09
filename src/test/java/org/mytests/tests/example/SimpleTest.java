package org.mytests.tests.example;

import org.testng.annotations.Test;

import java.time.LocalTime;

import static com.epam.web.matcher.testng.Assert.*;
import static org.mytests.uiobjects.example.site.JDIDesktop.*;

public class SimpleTest extends SimpleTestsInit {

    @Test
    public void verifyHomePage() {
        leftMenu.dates.click();
        leftMenu.support.click();
        leftMenu.contacts.click();//contactPage.open();
/*        String[] textForTextArea = new String[] {"Test", "Text Area editor"};
        contactPage.description.inputLines(textForTextArea);
        arrayEquals(contactPage.description.getLines(), textForTextArea);
        isFalse(contactPage.acceptConditions.isChecked());
        contactPage.acceptConditions.check();
        isTrue(contactPage.acceptConditions.isChecked());

        datesPage.open();
        datesPage.time.inputTime(LocalTime.of(8, 35));
        String date = "20/11/2017";
        datesPage.date.newInput(date);
        areEquals(datesPage.date.getValue(), date);
        datesPage.addFile.newInput("D:\\temp\\euro_b.png");
        assertContains(() -> datesPage.addFileLabel.getText(), "euro_b.png");*/
    }
    /*
    @Test
    public void pageTest() {
        loginTest();
        contactPage.open("contacts");
        contactPage.checkOpened();
        User user2 = new User().set(u->{u.name = "test name use 2";
            u.lastName = "user 2 last name";});
        contactPage.contactForm.submit(user2);
        System.out.println(user2);
        contactPage.contactForm.check(user2);
        User user = contactPage.contactForm.asEntity(User.class);
        assertEquals(user.name, "test name use 2");
    }
    @Test
    public void userTest() {
        User user1 = new User().set(u->u.name = "test name");
        User user2 = new User().set(u->{u.name = "test name use 2";
            u.lastName = "user 2 last name";});
        System.out.println(user1);
        System.out.println(user2);
    }*/

}
