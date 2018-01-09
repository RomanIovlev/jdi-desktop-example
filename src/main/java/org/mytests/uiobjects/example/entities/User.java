package org.mytests.uiobjects.example.entities;

import com.epam.commons.DataClass;
import com.epam.jdi.uitests.core.annotations.Name;

public class User extends DataClass<User> {
    public String name = "epam";
    public String password = "1234";
    public String lastName = "Iovlev";
    @Name("Description") public String descr = "Epam User";

}
