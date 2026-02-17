public class BannerUC4 {

    public static void main(String[] args) {
String[] banner = {
                "  *****   ******   ****** ",
                " *     *  *        *      ",
                " *     *  ******   ****** ",
                " *     *        *        *",
                "  *****   ******   ****** "
        };
        printBanner(banner);
    }
    public static void printBanner(String[] banner) {
        for (String line : banner) {
            System.out.println(line);
        }
    }
}