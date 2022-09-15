package org.agustin.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamMap {

    public static void main(String[] args) {
        Stream <String> nombres = Stream.of("Pepe","Juan","Agustin");
        nombres.forEach(System.out::println);
    }


}
