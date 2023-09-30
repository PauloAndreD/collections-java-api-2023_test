package main.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {

        // https://github.com/cami-la/collections-java-api-2023/blob/master/src/main/java/generics/GenericsExempleList.java

        // Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        // Iterando sobre a lista com Generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }
    }
}
