package com.nortal.commander;

/**
 * Created by arli on 8.12.2014.
 */
public class ExportCommand implements Command {

    @Override
    public void execute(String[] arguments, Environment environment) {
        String[] exportArgs = arguments;
        for(int i = 0; i < exportArgs.length ; i++) {
            environment.getEnvVariables()[environment.getEnvVariablesCnt()] = exportArgs[i];
            environment.setEnvVariablesCnt(environment.getEnvVariablesCnt()+1);
        }
    }
}
