package strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void string_is_not_empty() {
        assertFalse(StringUtil.isEmpty("Hola Mundo"));
    }

    @Test
    public void string_is_empty() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void null_is_empty() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_with_space_is_empty() {
        assertTrue(StringUtil.isEmpty(" "));
    }
}

