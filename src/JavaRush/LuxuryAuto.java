package JavaRush;

public class LuxuryAuto {
    private String model;
    private int manufactureYear;
    private int dollarPrice;
    public LuxuryAuto(String model, int manufactureYear, int dollarPrice) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.dollarPrice = dollarPrice;
    }
    //...геттеры, сеттеры и т.д.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LuxuryAuto that = (LuxuryAuto) o;

        if (manufactureYear != that.manufactureYear) return false;
        if (dollarPrice != that.dollarPrice) return false;
        return model.equals(that.model);
    }
    @Override
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + manufactureYear;
        result = 31 * result + dollarPrice;
        return result;
    }

    public static void main(String[] args) {

        LuxuryAuto ferrariGTO = new LuxuryAuto("Ferrari 250 GTO", 1963, 70000000);
        LuxuryAuto ferrariSpider = new LuxuryAuto("Ferrari 335 S Spider Scaglietti", 1963, 70000000);

        System.out.println("Эти два объекта равны друг другу?");
        System.out.println(ferrariGTO.equals(ferrariSpider));

        System.out.println("Какие у них хэш-коды?");
        System.out.println(ferrariGTO.hashCode());
        System.out.println(ferrariSpider.hashCode());
    }
}
