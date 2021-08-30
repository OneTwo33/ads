package ru.onetwo33.homework2.sort;

import ru.onetwo33.homework2.model.Notebook;

public class InsertionSortNotebook {
    public static void sort(Notebook[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Notebook value = arr[i];
            int j = i - 1;
            while (j >= 0) {
                if (arr[j].getPrice() > value.getPrice()) {
                    arr[j + 1] = arr[j];
                } else if (arr[j].getPrice().equals(value.getPrice())) {
                    if (arr[j].getRam() > value.getRam())
                        arr[j + 1] = arr[j];
                    else if (arr[j].getRam().equals(value.getRam())) {
                        if (arr[j].getBrand().getWeight() > value.getBrand().getWeight())
                            arr[j + 1] = arr[j];
                    }
                }
                j--;
            }

            arr[j + 1] = value;
        }
    }
}
