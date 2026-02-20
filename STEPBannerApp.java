/**
 * OOPSBannerApp - UC6
 * Refactored to use helper methods for character patterns
 * @author Khushi
 * @version 6.0
 */
public class STEPBannerApp {

    // Method to return pattern for 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };
    }

    // Method to return pattern for 'P'
    public static String[] getPPattern() {
        return new String[] {
            " *****   ",
            " *    *  ",
            " *    *  ",
            " *****   ",
            " *       ",
            " *       ",
            " *       "
        };
    }

    // Method to return pattern for 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  *****  ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            "  *****  "
        };
    }

    public static void main(String[] args) {
        // Build banner line by line using helper methods
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p  = getPPattern();
        String[] s  = getSPattern();

        // Loop through each row index (0–6) and print combined line
        for (int i = 0; i < 7; i++) {
            System.out.println(o1[i] + o2[i] + p[i] + s[i]);
        }
    }
}