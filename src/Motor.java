public class Motor extends Pojazd {

    protected int podatek;


    public Motor() {
        super();
        this.podatek = 2;
    }

    public Motor(int podatek) {
        this.podatek = podatek;
    }

    public Motor(String marka, String model, int cena, int podatek) {
        super(marka, model, cena);
        this.podatek = podatek;
    }


    @Override
    protected int koszt() {
        return super.koszt() + podatek;
    }



    @Override
    public String toString() {
        return "Motor: {" +
                super.toString() +
                ", Marka=" + marka +
                ", Model=" + model +
                '}';
    }
}