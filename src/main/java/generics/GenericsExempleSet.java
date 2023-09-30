package main.java.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
  public static void main(String[] args) {

    // https://github.com/cami-la/collections-java-api-2023/blob/master/src/main/java/generics/GenericsExempleSet.java

    // Exemplo com Generics
    Set<String> conjuntoGenerics = new HashSet<>();
    conjuntoGenerics.add("Elemento 1");
    conjuntoGenerics.add("Elemento 2");

    // Iterando sobre o conjunto com Generics
    for (String elemento : conjuntoGenerics) {
      System.out.println(elemento);
    }
  }
}
