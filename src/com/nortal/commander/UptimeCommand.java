package com.nortal.commander;

/**
 * Created by arli on 8.12.2014.
 */
public class UptimeCommand implements Command {
    @Override
    public void execute(String[] arguments, Environment environment) {
        long endTime = System.currentTimeMillis();
        long elapsed = ((endTime - environment.getBeginTime()) / 1000);

        String display = String.format("%02dh:%02dm:%02ds", elapsed / 3600, (elapsed % 3600) / 60, (elapsed % 60));
        System.out.println(display);
    }
}
