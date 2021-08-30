package ru.onetwo33;

import ru.onetwo33.model.Brand;
import ru.onetwo33.model.Notebook;
import ru.onetwo33.sort.InsertionSortNotebook;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Brand> brands = new ArrayList<>();
        brands.add(new Brand("Lenuvo", 100));
        brands.add(new Brand("Asos", 90));
        brands.add(new Brand("MacNote", 80));
        brands.add(new Brand("Eser", 70));
        brands.add(new Brand("Xamiou", 60));

        Notebook[] notebooks = RandomArrayNotebook.getArray(5000, brands.toArray(new Brand[0]));
        InsertionSortNotebook.sort(notebooks);
    }
}
