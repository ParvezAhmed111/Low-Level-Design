package DESIGN.LoggingSystem;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessorObj= new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessorObj.log(LogProcessor.ERROR, "exception happens");
        logProcessorObj.log(LogProcessor.DEBUG, "need to deploy this");
        logProcessorObj.log(LogProcessor.INFO, "just for info");
    }
}
