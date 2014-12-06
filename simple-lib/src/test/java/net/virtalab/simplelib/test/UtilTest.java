package net.virtalab.simplelib.test;

import junit.framework.Assert;
import net.virtalab.simplelib.Util;
import org.junit.Test;

/**
 * Testing utils
 *
 * @author John Doe <john@doe.com>
 * @since 1.0
 */
public class UtilTest {

    @Test
    public void reverseTest(){
        String src = "Terve";
        String exceptedStr = "evreT";

        String result = Util.reverse(src);

        Assert.assertTrue(result.equals(exceptedStr));
    }
}
