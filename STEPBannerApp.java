/**
 * OOPSBannerApp - UC4
 * Prints OOPS banner using String array and loop
 * @author Khushi
 * @version 4.0
 */
public class STEPBannerApp {
    public static void main(String[] args) {
        // Store all banner lines in a String array
        String[] bannerLines = {
            String.join("", "  *****  ", "  *****  ", " *****   ", "  *****  "),
            String.join("", " *     * ", " *     * ", " *    *  ", " *       "),
            String.join("", " *     * ", " *     * ", " *    *  ", " *       "),
            String.join("", " *     * ", " *     * ", " *****   ", "  *****  "),
            String.join("", " *     * ", " *     * ", " *       ", "       * "),
            String.join("", " *     * ", " *     * ", " *       ", "       * "),
            String.join("", "  *****  ", "  *****  ", " *       ", "  *****  ")
        };

        // Print each line using a loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}