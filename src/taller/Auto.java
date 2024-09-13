package taller;
public class Auto extends Vehiculo{

    int cantidadPuertas;

    // constructor  
    public Auto(int id, String patente, String marca, String modelo, String color, int cantidadPuertas){
        // llamamos al constructor de la clase padre (vehiculo) de la cual Auto hereda. Esto permite pasar los argumentos de Vehiculo a constructor de la clase base Auto.
        // de esta manera reutilizamos codigo del constructor padre, y evitamos duplicar la logica que inicializa esos campos comunes
        super(id,patente,marca,modelo,color); // Llama al constructor de la clase Vehiculo

        if(cantidadPuertas == 0){
            this.cantidadPuertas = 1; // indico que no se puede tener 0 puertas, el minimo es 1
        }else{
            this.cantidadPuertas = cantidadPuertas;
        }
    }

    // SETTER
    // Este metodo se encarga de cambiar el valor del atributo, despues de que el objeto haya sido creado
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas; 
    }

    // GETTER
    // el proposito del getter es devolver el valor de un atributo. 
    public int getCantidadPuertas() {
        return this.cantidadPuertas;
    }

    // heredamos el metodo arrancar de la clase padre 
    @Override // es override porque es un metodo que se creo por otra clase
    public void arrancar() {
        System.out.println("El auto arranco");
        return;
        // throw new UnsupportedOperationException("Unimplemented method 'arrancar'");
    }

    // sobreescribimos como queremos que se visualice el metodo toString para cada objeto que use el metodo.
    @Override // Override indica que es una sobreescritura
    public String toString() {
        // hay que indicar super a los atributos del padre
        return "Patente: "+ super.getPatente() +" marca: " + super.getMarca() + " modelo: " + super.getModelo() + " color: "+super.getColor();
    }

    public String imprimirDatosCompleto(){
        return "ID "+super.getId()+" Patente: "+ super.getPatente() +" marca: " + super.getMarca() + " modelo: " + super.getModelo() + " color: "+super.getColor()+" Cantidad puertas "+getCantidadPuertas();
    }

    public String imprimirDato(int opcion){ 
        if(opcion == 1){
        return "Modelo: "+ super.getModelo();
        }
        if(opcion == 2){
            return "Marca: "+ super.getMarca();
        }
        
        return "Dato no valido";
    }
}
