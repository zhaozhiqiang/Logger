/**
 * Created by zhiqizha on 5/21/2017.
 */
public class IndexFormatter implements IFormatter {
    private static int index = 0;

    @Override
    public String formatLog(int level, String log) {
        ++index;
        return index + " " + prefixLog[ (level / 10) - 1] + " " + log;
    }
}
