public class LogLevels {
    
    public static String message(String logLine) {
        logLine = logLine.substring(logLine.indexOf(':')+1);
        return logLine.trim();
    }

    public static String logLevel(String logLine) {
        logLine = logLine.substring(0,logLine.indexOf(']'));
        logLine = logLine.substring(logLine.indexOf('[')+1);
        return logLine.toLowerCase().trim();
    }

    public static String reformat(String logLine) {
        String tipus, message, logMessage;

        message = logLine.substring(logLine.indexOf(':')+1);
        message.trim();

        tipus = logLine.substring(0,logLine.indexOf(']'));
        tipus = logLine.substring(logLine.indexOf('[')+1);
        tipus.toLowerCase();

        return (message + "(" + tipus + ")");
    }
}
