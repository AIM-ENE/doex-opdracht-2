public class KlokDisplay {

    private NummerDisplay uren;
    private NummerDisplay minuten;

    private String display;

    public KlokDisplay() {
        uren = new NummerDisplay(24);
        minuten = new NummerDisplay(60);
    }

    public void tikTijd() {
        minuten.increment();
        if (minuten.getWaarde() == 0) {
            uren.increment();
        }
        updateDisplay();
    }

    public void updateDisplay() {
        display =  uren.getDisplay() + ":" + minuten.getDisplay();
    }

    public String getDisplay() {
        return display;
    }
}
