package taller;

public abstract class Vehiculo {
// declaramos Vehiculo como abstracto, ya que sera padre de Auto y Moto

// declaramos los atributos privados, para que solamente se puedan acceder desde los metodos constructor y  get and set
    private int id;
    private String marca;
    private String modelo;
    private String patente;
    private String color;

    // Validaciones en el constructor
    // Conviene validar en el constructor cuando queres asegurarte de que no se creen objetos invalidos desde el principio
    // defino el constructor
    public Vehiculo(int id, String patente, String marca, String modelo, String color){

        // variable de referencia = variable local
        this.id = id;

        // verificamos que no sea null la patente.
        if(patente != null){
            this.patente = patente.trim(); // el metodo trim elimina los espacios al inicio y al final de la cadena. " AA076UL " queda "AA076UL" 
        }else{  
            // el metodo trim() nos obliga a que siempre llegue un valor distinto a null
            this.patente = "Desconocido"; // Si no llega el valor de patente, se reemplazara por este valor. 
        }

        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    // SETTER y GETTER - son metodos que permiten acceder y modificar valores de propiedades de una clase, de manera controlada. Se utiliza para encapsular clases y que el acceso a sus atributos sea de manera segura. sin exponer de manera directa las variables de una clase. 
    // SIRVEN 1) para encapsular atributos, ya que permite controlar clases de tipo private, de esta manera controlar el acceso a los atributos.
    // 2) validacion: en los Setter podes agregar validaciones antes de cambiar el valor de un atributo. 

    // SETTER - modifica el valor de una propiedad. controla como se establece el valor de un atributo, lo que permite validar o procesar los datos antes de asignarlos
    // ej: public void setPatente(String patente) {
    //     if (patente != null && !patente.trim().isEmpty()) {
    //         this.patente = patente.trim();
    //     } else {
    //         throw new IllegalArgumentException("La patente no puede estar vacía");
    //     }
    // }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

// Esta es una manera de manipular los datos que se ingresan
// Validamos en el set cuando vamos a modificar/actualizar un atributo de un objeto ya creado. Para evitar posteriores problemas de validacion
    public void setMarca(String marca) {
        if(marca == "Toyoota"){
            this.marca = "Toyota";
        }else{
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if(patente != null){
            this.patente = patente.trim(); // el metodo trim elimina los espacios al inicio y al final de la cadena. " AA076UL " queda "AA076UL" 
        }else{  
            // el metodo trim() nos obliga a que siempre llegue un valor distinto a null
            this.patente = "Desconocido"; // Si no llega el valor de patente, se reemplazara por este valor. 
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // declaramos un metodo 
    public abstract void arrancar();

}
