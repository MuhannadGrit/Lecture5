package DesignPatternExercise;

public class LoggerFactory {
    public LoggingStrategy getLoggingStrategy(String type) {
        switch (type) {
            case "console":
                return new ConsoleLogging();
            case "file":
                return new FileLogging();
            case "network":
                return new NetworkLogging();
            default:
                return null;
        }
    }
}
