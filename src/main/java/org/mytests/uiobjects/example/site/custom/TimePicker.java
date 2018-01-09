package org.mytests.uiobjects.example.site.custom;

import com.epam.jdi.uitests.win.winnium.elements.common.Button;
import com.epam.jdi.uitests.win.winnium.elements.common.TextBox;
import org.openqa.selenium.By;

import java.time.LocalTime;

/**
 * Created by Roman_Iovlev on 12/22/2017.
 */
public class TimePicker extends TextBox {

    private Button timer;//    = new Button(By.className("fa-clock-o"));
    private TextBox hours    = new TextBox(By.className("bootstrap-timepicker-hour"));
    private TextBox minutes  = new TextBox(By.className("bootstrap-timepicker-minute"));
    private TextBox meridian = new TextBox(By.className("bootstrap-timepicker-meridian"));

    public void inputTime(LocalTime time) {
        timer.click();
        int hour = time.getHour();
        String pmam = "AM";
        if (hour > 12) {
            hour = hour - 12;
            pmam = "PM";
        }
        hours.newInput(hour+"");
        minutes.newInput(time.getMinute()+"");
        meridian.newInput(pmam);
    }

}
