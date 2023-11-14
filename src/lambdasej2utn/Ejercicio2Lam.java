
package lambdasej2utn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Ejercicio2Lam {
    
    public void ordenarPalabras(){
        List<String>listaJugadores = new ArrayList<>();
        listaJugadores.add ("2 Messi");
        listaJugadores.add("4 Ronaldo");
        listaJugadores.add("3 Neymar");
        listaJugadores.add("5 Van Nistelroy");
        listaJugadores.add("1 Álvez");
        
       String listaOrdenada = listaJugadores.stream().sorted().collect(Collectors.joining(" , "));
        System.out.println("La lista de jugadores es " + listaOrdenada);
    }
    
}
