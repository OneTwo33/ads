package ru.onetwo33.homework2;

import ru.onetwo33.homework2.model.Brand;
import ru.onetwo33.homework2.model.Notebook;

import java.util.Random;

public class RandomArrayNotebook {

    private static final Random random = new Random();

    public static Notebook[] getArray(int length, Brand[] brands) {
        Notebook[] arr = new Notebook[length];

        for (int i = 0; i < arr.length; i++) {
            int brandNum = random.nextInt(brands.length);
            arr[i] = new Notebook(brands[brandNum], getRndIntWithStep(500, 2100, 100), getRndIntWithStep(4, 20, 4));
        }

        return arr;
    }

    private static int getRndIntWithStep(int min, int max, int step) {
        int range = (max - min) / step;
        return (int) (Math.floor(Math.random() * range) * step + min);
    }
}
