package com.nortal.commander;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Environment env = new Environment();
        env.setEnvVariables(10);
        env.setEnvVariablesCnt(0);
        env.setbeginTime(System.currentTimeMillis());

        while (true) {
            System.out.print("# ");
            String line = scanner.nextLine();
            if ("exit".equals(line)) {
                break;
            }
            Command command = getCommand(line);
            command.execute(getArguments(line), env);
        }
    }
    private static String[] getArguments (String commandLine) {
        Scanner sc = new Scanner(commandLine);
        if(commandLine.startsWith("echo")) {sc.skip("echo ");}
        if(commandLine.startsWith("export")) {sc.skip("export ");}
        String modifiedCommandLine = sc.nextLine();
        String[] arguments = modifiedCommandLine.split(" ");
        return arguments;
    }

    private static Command getCommand(String commandLine) {
        if (commandLine.startsWith("export")){
            return new ExportCommand();
        }
        else if ("uptime".equals(commandLine)) {
            return new UptimeCommand();
        }
        else if ("date".equals(commandLine)) {
            return new DateCommand();
        }
        else if ("env".equals(commandLine)){
            return new EnvCommand();
        }
        else if (commandLine.startsWith("echo")){
            return new EchoCommand();
        }
        else {
            return new InvalidCommand();
        }
    }
}