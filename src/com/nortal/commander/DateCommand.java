package com.nortal.commander;

import java.util.Date;

/**
 * Created by arli on 8.12.2014.
 */
public class DateCommand implements Command {
    @Override
    public void execute(String[] arguments, Environment environment) {
        //Kas see on tavaline, et implementeerib Command interface aga ei kasuta selle parameetreid ?
        Date date = new Date();
        System.out.println(date.toString());
    }
}
