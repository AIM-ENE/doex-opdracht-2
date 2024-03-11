public class App {
    public static void main(String[] args) {
        KlokDisplay klok = new KlokDisplay();
        for (int i = 0; i < 24 * 60 + 1; i++) {
            klok.tikTijd();
            System.out.println(klok.getDisplay());
        }
    }
}
