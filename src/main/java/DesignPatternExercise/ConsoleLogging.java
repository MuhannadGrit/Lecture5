package DesignPatternExercise;

public class ConsoleLogging implements LoggingStrategy {
    @Override
    public void log(String message) {
        System.out.printf("Console Logging: %s %n", message);
    }
}
