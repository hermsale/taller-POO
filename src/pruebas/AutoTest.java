package pruebas;

import taller.Auto;

public class AutoTest{

    // como buena practica declaramos un class en donde se realizaran los test unitarios

    // declaramos un metodo que creara los autos
    public String CrearAuto(){
         Auto autoDos = new Auto(2, "AA076UL", "Ford", "Fiesta", "Gris", 4);

        //  crea el nuevo auto y lo devuelve 
         return autoDos.toString();
    }

    // "Patente: "+ super.getPatente() +"marca: " + super.getMarca() + " modelo: " + super.getModelo() + " color: "+super.getColor();
    public void TestCrearAuto(){
        String resultado = CrearAuto();
        System.out.println(resultado);
        if(resultado.equals("Patente: AA076UL marca: Ford modelo: Fiesta color: Gris")){
            System.out.println("Auto creado con exito");
        }else{
            System.out.println("Hubo un error");
        }
    }

    public AutoTest(){
        this.TestCrearAuto();
    }
}