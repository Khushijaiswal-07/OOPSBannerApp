/**
 * OOPSBannerApp - UC3
 * Prints OOPS banner using String.join() with proper alignment
 * @author Khushi
 * @version 3.0
 */
public class STEPBannerApp {
    public static void main(String[] args) {
        // Each row of the banner
        System.out.println(
            String.join("",
                "  *****  ", "  *****  ", " *****   ", "  *****  ")
        );
        System.out.println(
            String.join("",
                " *     * ", " *     * ", " *    *  ", " *       ")
        );
        System.out.println(
            String.join("",
                " *     * ", " *     * ", " *    *  ", " *       ")
        );
        System.out.println(
            String.join("",
                " *     * ", " *     * ", " *****   ", "  *****  ")
        );
        System.out.println(
            String.join("",
                " *     * ", " *     * ", " *       ", "       * ")
        );
        System.out.println(
            String.join("",
                " *     * ", " *     * ", " *       ", "       * ")
        );
        System.out.println(
            String.join("",
                "  *****  ", "  *****  ", " *       ", "  *****  ")
        );
    }
}