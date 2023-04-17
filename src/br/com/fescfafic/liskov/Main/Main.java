package br.com.fescfafic.liskov.Main;

import br.com.fescfafic.liskov.Model.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Animal gato = new Gato("Preta", 4, "F");
        Animal cachorro = new Cachorro ("Sushi", 3, "F");
        Animal animalSelvagem = new AnimalSelvagem("Shoyo", 0, "M");

        ArrayList<Animal> listaDeAnimais = new ArrayList<>();

        listaDeAnimais.add(gato);
        listaDeAnimais.add(cachorro);
        listaDeAnimais.add(animalSelvagem);

        for (Animal p : listaDeAnimais){
            System.out.printf("%s emitiu um som: ", p.nome);
            p.emitirSom();
        }


    }
}