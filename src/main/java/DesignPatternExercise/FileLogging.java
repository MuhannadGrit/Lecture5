package DesignPatternExercise;

public class FileLogging implements LoggingStrategy {
    @Override
    public void log(String message) {
        System.out.println("File logger: " + message);
    }
}
