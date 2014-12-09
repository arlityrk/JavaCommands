package com.nortal.commander;

/**
 * Created by arli on 8.12.2014.
 */
public class InvalidCommand implements Command{
    @Override
    public void execute(String[] arguments, Environment environment) {
        System.out.print("Unknown command: ");
        for(int i = 0; i < arguments.length; i++) {
            System.out.print(arguments[i]+ " ");
        }
        System.out.println();
    }
}
