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
        logMessage = logLine;
        tipus = logMessage.substring(0,logMessage.indexOf(']'));
        tipus = tipus.substring(tipus.indexOf('[')+1);


        message = logLine.substring(logLine.indexOf(':')+1);




        return (message.trim() + " (" + tipus.toLowerCase() + ")");
    }
}
