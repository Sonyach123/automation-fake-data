package generators;

import API.Generator;
import models.Currency;

import java.util.Random;

public class CurrencyGenerator implements Generator<Currency> {

    private final Random random;

    public CurrencyGenerator() {
        random = new Random();
    }


}
