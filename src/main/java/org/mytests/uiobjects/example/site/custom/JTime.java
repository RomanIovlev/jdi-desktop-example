package org.mytests.uiobjects.example.site.custom;

import org.openqa.selenium.support.FindBy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Roman_Iovlev on 12/24/2017.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface JTime {
    FindBy timer() default @FindBy();
    FindBy hours() default @FindBy();
    FindBy minutes() default @FindBy();
    FindBy meridian() default @FindBy();
    FindBy value() default @FindBy();
}
