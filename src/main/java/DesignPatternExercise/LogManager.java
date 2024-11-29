package DesignPatternExercise;

public class LogManager {

    //Singleton
    private static LogManager instance;
    private LoggingStrategy loggingStrategy;

    private LogManager() {
        // Standardstrategin är nu ConsoleLoggning
        this.loggingStrategy = new ConsoleLogging();
    }

    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

  //Strategy
    public void setLoggingStrategy(LoggingStrategy strategy) {
        this.loggingStrategy = strategy;
    }

    public void logMessage(String   message) {
        loggingStrategy.log(message);
    }
}
