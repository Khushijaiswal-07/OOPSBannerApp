/**
 * OOPSBannerApp - UC5
 * Prints OOPS banner using inline array initialization with String.join()
 * @author Khushi
 * @version 5.0
 */
public class STEPBannerApp {
    public static void main(String[] args) {
        // Inline declaration + initialization of banner lines
        String[] bannerLines = {
            String.join("", "  *****  ", "  *****  ", " *****   ", "  *****  "),
            String.join("", " *     * ", " *     * ", " *    *  ", " *       "),
            String.join("", " *     * ", " *     * ", " *    *  ", " *       "),
            String.join("", " *     * ", " *     * ", " *****   ", "  *****  "),
            String.join("", " *     * ", " *     * ", " *       ", "       * "),
            String.join("", " *     * ", " *     * ", " *       ", "       * "),
            String.join("", "  *****  ", "  *****  ", " *       ", "  *****  ")
        };

        // Print each line using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}