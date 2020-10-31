package generators;

import API.Generator;

import java.awt.*;
import java.util.Random;

public class ColorGenerator implements Generator<Color> {

    private final Random random;

     public ColorGenerator(){
        random = new Random();
    }


}
