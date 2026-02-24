public class OOPSBannerUC5 {

    public static void main(String[] args) {

        // Inline declaration + initialization
        String[] lines = {
            String.join(" ", "  *****  ", "  *****  ", " ******  ", "  *****  "),
            String.join(" ", " *     * ", " *     * ", " *     * ", " *     * "),
            String.join(" ", "*       *", "*       *", " *     * ", "*        "),
            String.join(" ", "*       *", "*       *", " ******  ", "  *****  "),
            String.join(" ", "*       *", "*       *", " *       ", "       * "),
            String.join(" ", " *     * ", " *     * ", " *       ", " *     * "),
            String.join(" ", "  *****  ", "  *****  ", " *       ", "  *****  ")
        };

        // Enhanced for-loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}