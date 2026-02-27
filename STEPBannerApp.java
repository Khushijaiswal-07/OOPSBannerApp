/**
 * OOPSBannerApp - UC8
 * Uses HashMap to store character patterns and render banner
 * @author Khushi
 * @version 8.0
 */

import java.util.HashMap;
import java.util.Map;

public class STEPBannerApp {

    // ---------- Utility Method ----------
    // Create and return map of character patterns
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        });

        map.put('P', new String[]{
            " *****   ",
            " *    *  ",
            " *    *  ",
            " *****   ",
            " *       ",
            " *       ",
            " *       "
        });

        map.put('S', new String[]{
            "  *****  ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            "  *****  "
        });

        return map;
    }

    // ---------- Display Method ----------
    // Render banner using map
    public static void printBanner(String message,
                                   Map<Character, String[]> charMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                line.append(pattern[row]);
            }

            System.out.println(line.toString());
        }
    }

    // ---------- Main Method ----------
    public static void main(String[] args) {

        Map<Character, String[]> characterMap =
                buildCharacterMap();

        printBanner("OOPS", characterMap);
    }
}