package net.virtalab.simplelib;

/**
 * Sample class
 *
 * @author John Doe <john@doe.com>
 * @since 1.0
 */
public class Util {
    /**
     * Produces String with letters from last to first
     *
     * @param orig string to reverse
     * @return reversed string
     */
    public static String reverse(String orig){
        int i, len = orig.length();
        StringBuilder tgt = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            tgt.append(orig.charAt(i));
        }

        return tgt.toString();

    }
}
