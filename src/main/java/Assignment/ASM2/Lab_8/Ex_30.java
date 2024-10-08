package Assignment.ASM2.Lab_8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class LogEventException extends Exception {
    public LogEventException(String message) {
        super(message);
    }
}
class LogManager {
    public void logEvent(String event, String logFilePath) throws LogEventException {
        File logFile = new File(logFilePath);
        if (!logFile.canWrite()) {
            throw new LogEventException("Cannot access log file: " + logFilePath);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(event);
            writer.newLine();
            System.out.println("Event logged successfully.");
        } catch (IOException e) {
            throw new LogEventException("Failed to log event: " + e.getMessage());
        }
    }
}
public class Ex_30 {
    public static void main(String[] args) {
        LogManager logManager = new LogManager();
        try {
            logManager.logEvent("Application started", "src/main/java/Lab_8/validfile.txt");
        } catch (LogEventException e) {
            System.out.println(e.getMessage());
        }
    }
}
