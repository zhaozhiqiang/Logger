import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zhiqizha on 5/21/2017.
 */
class IndexFormatterTest {
    @Test
    void formatLog() {
        int level = 40;
        String log1 = "this is log1";
        String log2 = "this is log2";
        String expectLog1 = "1 ERROR this is log1";
        String expectLog2 = "2 ERROR this is log2";
        IndexFormatter formatter = new IndexFormatter();
        assertEquals(expectLog1, formatter.formatLog(level, log1));
        assertEquals(expectLog2, formatter.formatLog(level, log2));
    }

}