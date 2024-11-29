package DesignPatternExercise;

public class NetworkLogging implements LoggingStrategy{
    @Override
    public void log(String message) {
        System.out.println("Network Logger " + message);
    }
}
