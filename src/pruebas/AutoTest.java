package pruebas;

import taller.Auto;

public class AutoTest {

    // como buena practica declaramos un class en donde se realizaran los test unitarios

    // declaramos un metodo que creara los autos
    public String crearAuto(){
         Auto autoDos = new Auto(2, "AA076UL", "Ford", "Fiesta", "Gris", 4);

         return autoDos.toString();
    }

    public void TestCrearAuto(){
        
    }
}
