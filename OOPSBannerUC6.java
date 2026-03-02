public class OOPSBannerUC6 {
    public static String[] getOPattern() {
        return String.join("\n",
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        ).split("\n");
    }
    public static String[] getPPattern() {
        return String.join("\n",
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        ).split("\n");
    }
    public static String[] getSPattern() {
        return String.join("\n",
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        ).split("\n");
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                switch (ch) {
                    case 'O':
                        line.append(o[row]).append(" ");
                        break;
                    case 'P':
                        line.append(p[row]).append(" ");
                        break;
                    case 'S':
                        line.append(s[row]).append(" ");
                        break;
                }
            }

            System.out.println(line);
        }
    }
}