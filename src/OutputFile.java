import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zhiqizha on 5/21/2017.
 */
public class OutputFile implements IOutputLog {

    private String _path = "";


    public OutputFile(String path) {
        _path = path;
    }

    @Override
    public void output(String log) {
        try {
            FileWriter writer = new FileWriter(_path, true);
            writer.write(log + "\r\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
