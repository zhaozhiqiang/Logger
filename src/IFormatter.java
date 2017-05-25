/**
 * Created by zhiqizha on 5/21/2017.
 */
public interface IFormatter {
    String formatLog(int level, String log);
    String prefixLog[] =  {"DEBUG" ,"INFO", "WARNING", "ERROR",  "CRITICAL"};
}
