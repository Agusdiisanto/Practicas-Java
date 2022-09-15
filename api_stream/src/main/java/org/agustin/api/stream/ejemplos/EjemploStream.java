package org.agustin.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {

    public static void main(String[] args) {

       // Stream <String> nombres = Stream.of("Pepe","Juan","Agustin")
        // nombres.forEach(System.out::println);

        List <String> listas = new ArrayList<>();
        listas.add("Paco");
        listas.add("Juan");
        listas.add("Agustin");

        //Stream<String> nombres = listas.stream();
        //nombres.forEach(System.out::println);

        listas.stream().forEach(System.out::println);

    }



}
