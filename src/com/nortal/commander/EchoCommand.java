package com.nortal.commander;

/**
 * Created by arli on 8.12.2014.
 */
public class EchoCommand implements Command {
    @Override
    public void execute(String[] arguments, Environment environment) {
        Boolean VarKeyNotFound = true;
        String[] echoArgs = arguments;
        if(echoArgs[0].startsWith("$")){
            echoArgs[0] = echoArgs[0].replaceAll("\\$","");
            for (int i = 0; i < environment.getEnvVariablesCnt(); i++){
                String[] splitEnvVariable = environment.getEnvVariables()[i].split("=");
                if (splitEnvVariable[0].equals(echoArgs[0])){
                    VarKeyNotFound = false;
                    System.out.println("> " + splitEnvVariable[1]);
                }
            }
            if(VarKeyNotFound) {System.out.println("No such key found");}
        }
        else {
            for (int i = 0; i < echoArgs.length; i++) {
                System.out.print(echoArgs[i] + " ");
            }
            System.out.println();
        }
    }
}
