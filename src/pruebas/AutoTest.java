package pruebas;

import taller.Auto;

public class AutoTest{

    // como buena practica declaramos un class en donde se realizaran los test unitarios

    // declaramos un metodo que creara los autos
    public String CrearAuto(){
         Auto autoDos = new Auto(2, "AA076UL", "Ford", "Fiesta", "Gris", 4);

        //  crea el nuevo auto, con el formato toString que se definio en la clase Auto
         return autoDos.toString();
    }

    // tenemos que pasar el valor del metodo crearAuto a un String resultado, debido a que no se puede comparar directamente con el metodo. Si intentamos hacer crearAuto()=="Patente: AA076UL marca: Ford modelo: Fiesta color: Gris" . se esta queriendo comparar una cadena de manera incorrecta. La manera correcta es usando el metodo equals. Pero 
    public void TestCrearAuto(){
        // guardamos el array de texto en una variable String
        // String resultado = CrearAuto();
        // comparamos el resultado con el esperado
        // System.out.println(resultado);
        //  utilizamos el metodo equals para comparar el valor del texto, con el esperado . se puede utilizar en el mismo metodo o en el resultado.equals 
        if(CrearAuto().equals("Patente: AA076UL marca: Ford modelo: Fiesta color: Gris")){
            System.out.println("Auto creado con exito");
        }else{
            System.out.println("Hubo un error");
        }
    }

    public AutoTest(){
        this.TestCrearAuto();
    }
}