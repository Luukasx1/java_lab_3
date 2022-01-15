public class Pojazd {

    protected String marka;
    protected String model;
    protected int cena;
    private boolean czyPojazd;
    /* Konstruktory */
    public Pojazd() {
        this.marka = "";
        this.model = "";
        this.cena = 0;
        czyPojazd = true;
    }

    public Pojazd(String marka, String model, int cena) {
        super();
        this.marka = marka;
        this.model = model;
        this.cena = cena;
        czyPojazd = true;
    }
    protected int koszt() {
        return this.cena;
    }

    @Override
    public String toString() {
        return "Pojazd: {" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", czyPojazd='" + (czyPojazd ? "Tak" : "Nie") + '\'' +
                ", cena=" + cena +
                '}';
    }
}