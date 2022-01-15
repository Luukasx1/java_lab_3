public class Osobowka extends Motor {
    protected int koszt_rejestracji;

    public Osobowka() {
        super();
        this.koszt_rejestracji = 0;
    }
    public Osobowka(int koszt_rejestracji) {
        this.koszt_rejestracji = koszt_rejestracji;
    }
    public Osobowka(int podatek, int koszt_rejestracji) {
        super(podatek);
        this.koszt_rejestracji = koszt_rejestracji;
    }
    public Osobowka(String marka, String model, int cena, int koszt_rejestracji) {
        super(marka, model, cena, koszt_rejestracji);
    }
    public Osobowka(String marka, String model, int cena, int koszt_rejestracji, int ubezpieczenie) {
        super(marka, model, cena, koszt_rejestracji);
        this.koszt_rejestracji = koszt_rejestracji;
    }

    @Override
    protected int koszt() {
        return super.koszt() + koszt_rejestracji + podatek;
    }

    @Override
    public String toString() {
        return "Osobowka: {" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", cena=" + cena +
                ", koszt rejestracji=" + koszt_rejestracji +
                ", podatek=" + podatek +
                '}';
    }

}