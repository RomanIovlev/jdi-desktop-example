package org.mytests.uiobjects.example.entities;

/**
 * Created by Roman_Iovlev on 12/21/2017.
 */
public class Users {
    public static final User defaultUser = new User().set(u ->
        {u.name = "Roman"; u.lastName = "Iovlev";});
    public static final User user2 = new User().set(u ->
        {u.name = "Roman2"; u.lastName = "Iovlev";});
}
