import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zhiqizha on 5/23/2017.
 */
class LogHandlerTest {
    LogHandler _logHandler;
    @BeforeEach
    void setUp() {
        _logHandler = new LogHandler(
                30, new IndexFormatter(), new OutputConsole());
    }

    @Test
    void process_low_level() {
        int level = 20;
        String log = "This is test for low level";
        String expected = "";
        testResult(level, log, expected);
    }

    @Test
    void process_output_console() {
        int level = 40;
        String log = "This is test for ERROR";
        String expected = "3 ERROR This is test for ERROR\r\n";
        testResult(level, log, expected);
    }

    void testResult(int level, String log, String expected) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        _logHandler.process(level, log);
        assertEquals(expected, outContent.toString());
    }

}