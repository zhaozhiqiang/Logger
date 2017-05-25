/**
 * Created by zhiqizha on 5/17/2017.
 */
public class OutputConsole implements IOutputLog {
    @Override
    public void output(String log) {
        System.out.println(log);
    }
}
