package com.nortal.commander;

/**
 * Created by arli on 7.12.2014.
 */
public interface Command {
    void execute(String[] arguments, Environment environment);
}
