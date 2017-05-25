import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zhiqizha on 5/17/2017.
 */

public class Logger {

    public static int DEBUG    = 10;
    public static int INFO     = 20;
    public static int WARNING  = 30;
    public static int ERROR    = 40;
    public static int CRITICAL = 50;

    private ArrayList logHandlerList = new ArrayList();

    public void addLogHandler(int level,
                              IFormatter formatter,
                              IOutputLog outputLog) {
        logHandlerList.add(new LogHandler(level, formatter, outputLog));
    }

    public void log(int level, String log) {
        for (Iterator<LogHandler> itLogHandler = logHandlerList.iterator();
             itLogHandler.hasNext();) {
            LogHandler logHandler = itLogHandler.next();
            logHandler.process(level, log);
        }
    }

    public void log(String log) {
        System.out.println(log);
    }
}
