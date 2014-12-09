package com.nortal.commander;

/**
 * Created by arli on 8.12.2014.
 */
public class EnvCommand implements Command {
    @Override
    public void execute(String[] arguments, Environment environment) {
        String[] exportArgs = arguments;
        for (int i = 0; i < environment.getEnvVariablesCnt(); i++) {
            System.out.println(environment.getEnvVariables()[i]);
        }
    }
}
