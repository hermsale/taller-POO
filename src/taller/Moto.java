package taller;
// clase heredera de Vehiculo (hereda todos los atributos de Vehiculo)
public class Moto extends Vehiculo{
    // atributos propios de la clase Moto
    public String tipomanubrio;

    // genero el metodo constructor. uso super para asignar los valores de los atributos heredados. y asigno el valor del atributo base a Moto
    public Moto(int id, String patente, String marca, String modelo, String color, String tipoManubrio){
        super(id, patente, marca, modelo, color);
        this.tipomanubrio = tipoManubrio;
    }

    // SETTER
    public void setTipomanubrio(String tipomanubrio) {
        this.tipomanubrio = tipomanubrio;
    }
    // GETTER
    public String getTipomanubrio() {
        return tipomanubrio;
    }

    // la clase Moto, al ser heredera de Vehiculo, debe implementar si o si los metodos de vehiculo, de lo contrario saldra un error. Para ello lo hacemos de la siguiente manera
    @Override
    public void arrancar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'arrancar'");
    }

}
