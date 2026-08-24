package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();

    public String getRandomColor(){
        color[] colors = color.values();
        int index = random.nextInt(colors.length);
        return colors[index].name();
    }
}
