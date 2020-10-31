import generators.ColorGenerator;
import generators.CreditCardGenerator;
import generators.CurrencyGenerator;

public class FakeData {
    public static void main(String[] args) {
        System.out.println(new ColorGenerator().generate());
    }
}

