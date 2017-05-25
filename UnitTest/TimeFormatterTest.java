import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by zhiqizha on 5/21/2017.
 */
class TimeFormatterTest {
    @Test
    void formatLog() {
        int level = 40;
        String log = "this is log";
        TimeFormatter formatter = new TimeFormatter();
        assertTrue(formatter.formatLog(level, log).contains("2017"));
    }

}