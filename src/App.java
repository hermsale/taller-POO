import taller.Auto;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // maneras de crear instancias
        // 1. 
        // Creamos una instancia vacia. completando todos los campos con valores por defecto. Creando la instancia de esta manera, no hace falta despues setear todos los valores. Ya que tendra valores por defecto iniciales. 
        Auto autoUno = new Auto(0, null, null, null, null,0);
        // completamos la instancia vacia utilizando el set. Ya que son instancias privadas y no se puede acceder de manera directa
        autoUno.setId(1);
        autoUno.setMarca("Toyota");
        autoUno.setModelo("Corolla");
        autoUno.setPatente("AB076OU"); // Si esta linea no se llega a cargar por el motivo que sea, se validó para que la clase Vehiculo indique de valor "Desconocido"
        autoUno.setColor("Gris");
        autoUno.setCantidadPuertas(4);

        // 2.
        // definimos una clase con datos. hay que agregar el atributo cantidad de puertas, que es propio de la clase auto. 
        Auto autoDos = new Auto(2, "AA076UL", "Ford", "Fiesta", "Gris", 4);

        Auto autoTres = new Auto(3, "AB111OL", "Chevrolet", "Tracker", "Azul", 5);
        Auto autoCuatro = new Auto(4, "AC123AB", "Dodge", "Journey", "Rojo", 5);
        Auto autoCinco = new Auto(5, "AD441AZ", "Renault", "Kangoo", "Amarillo", 5);
    
        // NO SE PUEDE DE LA SIGUIENTE MANERA
        // System.out.println(autoOtro.marca + " " + autoOtro.marca); // no se puede acceder directamente a los atributos, debido a que son privados

        // cuando se definen atributos privados y se utiliza get y set para acceder. esta es la manera correcta de citar dichos atributos
        System.out.println("El id es "+autoDos.getId()+" marca y modelo "+autoDos.getMarca() + " "+autoDos.getModelo());
        System.out.println("Patente "+autoUno.getPatente()+" Marca y Modelo "+autoUno.getMarca()+" "+autoUno.getModelo());
        System.out.println("Patente "+autoTres.getPatente()+" Marca y Modelo "+autoTres.getMarca()+" "+autoTres.getModelo());
        // Este metodo de acceso a la informacion puede ser muy engorroso, por la reiteracion de codigo.
        // Para resolver tanta reiteracion de codigo, podemos utilizar el metodo toString

        // esta es una buena manera usando el metodo toString. Primero tenemos que definir como queremos que se visualice en la clase Auto
        System.out.println(autoUno.toString());
        System.out.println(autoCuatro.toString());
        System.out.println(autoCinco.toString());
        autoCuatro.arrancar();

        // utilizando objetos ArrayList para crear una lista de autos. Creamos un ArrayList de tipo Auto.
        ArrayList<Auto> autos = new ArrayList<>();
        // Agregamos a la lista, cada auto de la siguiente manera. 
        autos.add(autoUno);
        autos.add(autoDos);
        autos.add(autoTres);
        autos.add(autoCuatro);
        autos.add(autoCinco);

        // Mostramos la lista con alguna de las siguientes opciones:
        // 1. Recorriendo la lista con un for - manera tradicional
        for (Auto auto : autos) {
            System.out.println(auto.toString());
        }
        // 2. Usando forEarch - utilizando referencia de método 
        autos.forEach(System.out::println);

        // 3. usando forEach - utilizando expresion lambda
        autos.forEach(auto -> System.out.println(auto));

        

    }
}
