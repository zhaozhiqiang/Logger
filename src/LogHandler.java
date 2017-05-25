/**
 * Created by zhiqizha on 5/23/2017.
 */
public class LogHandler {

    private int _level = 0;
    private IFormatter _formatter;
    private IOutputLog _outputLog;

    public LogHandler(int level, IFormatter formatter, IOutputLog outputLog) {
        _level = level;
        _formatter = formatter;
        _outputLog = outputLog;
    }

    public void process(int level, String log) {
        if (level < _level) {
            return;
        }

        String formattedLog = _formatter.formatLog(level, log);
        _outputLog.output(formattedLog);
    }
}
