public class NummerDisplay {
    private int waarde;
    private final int limiet;

    public NummerDisplay(int limiet) {
        this.limiet = limiet;
        waarde = 0;
    }

    public void increment() {
        waarde++;
        if (waarde == limiet) {
            waarde = 0;
        }
    }

    public int getWaarde() {
        return waarde;
    }

    public String getDisplay() {
        if (waarde < 10) {
            return "0" + waarde;
        } else {
            return "" + waarde;
        }
    }
}
