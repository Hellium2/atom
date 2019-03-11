import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class UtilTest {

    @Test
    public void getWurg0() throws Exception {
        assertEquals(null, Util.getWord("nodictionary.txt"));
    }

    @Test
    public void getWurg1() throws Exception {
        assertEquals("test", Util.getWord("TestText.txt"));
    }

    @Test
    public void cows0() throws Exception {
        String str = "test";
        String str1 = "tested";
        assertEquals(5, Util.cows(str.toCharArray(), str1.toCharArray()));
    }

    @Test
    public void bulls0() throws Exception {
        String str = "line";
        String str1 = "lenin";
        assertEquals(2, Util.bulls(str.toCharArray(), str1.toCharArray()));
    }
}
