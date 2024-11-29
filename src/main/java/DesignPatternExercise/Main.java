package DesignPatternExercise;

public class Main {
    public static void main(String[] args) {
        LogManager logManager = LogManager.getInstance();
        LoggerFactory loggerFactory = new LoggerFactory();

        // Ändra loggningsstrategy till FileLoggning
        LoggingStrategy fileLogger = loggerFactory.getLoggingStrategy("file");
        logManager.setLoggingStrategy(fileLogger);
        logManager.logMessage("Det här är ett test meddelande File");

        //Ändra loggningsstrategi till NetworkLoggning
        LoggingStrategy networkLogger = loggerFactory.getLoggingStrategy("network");
        logManager.setLoggingStrategy(networkLogger);
        logManager.logMessage("Det här är ett test meddelande File");

        //Ändra loggningsstrategi till ConsoleLoggning
        LoggingStrategy consoleLogger = loggerFactory.getLoggingStrategy("console");
        logManager.setLoggingStrategy(consoleLogger);
        logManager.logMessage("Det här är ett test meddelande File");
    }
}
