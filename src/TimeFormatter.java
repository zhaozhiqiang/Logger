import java.util.Date;

/**
 * Created by zhiqizha on 5/21/2017.
 */
public class TimeFormatter implements IFormatter {
    @Override
    public String formatLog(int level, String log) {
        return new Date().toString()
                + " " + prefixLog[ (level / 10) - 1]
                + " " + log;
    }
}
