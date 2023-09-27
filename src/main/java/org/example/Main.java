package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ciclista> lista = new ArrayList<Ciclista>();
        lista.add(new Ciclista("Simon Yates","28","Reino Unido",35.34));
        lista.add(new Ciclista("Pello Bilbao","29","España",35.31));
        lista.add(new Ciclista("Wout Van Aert","29","Belgica",35.27));
        lista.add(new Ciclista("Tadej Pogacar","26","Eslovenia",34.14));
        lista.add(new Ciclista("Jonas Vingegaard","26","Dinamarca",32.36));

        Ciclista menorTiempo=lista.get(0);

        for (int i=0; i<lista.size(); i++){
            if (lista.get(i).getTiempoEnLaCronoIndividual()< menorTiempo.getTiempoEnLaCronoIndividual()){
                menorTiempo=lista.get(i);
            }
        }

        System.out.println("El ciclista con el menor tiempo en la crono individual fue: "+menorTiempo.getNombreCiclista()+" con un tiempo de: "+menorTiempo.getTiempoEnLaCronoIndividual()+" esto lo logra el corredor de la nacion de "+menorTiempo.getPaisDeOrigenDelCiclista()+" a la edad de "+menorTiempo.getEdadCiclista()+" años ");

    }
}