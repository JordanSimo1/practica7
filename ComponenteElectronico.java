
 

/**
 *
 * @author Jordan Simo
 */
public abstract class ComponenteElectronico extends DispositivoElectronico {
    
    public ComponenteElectronico(String fabricante, String marca, String nombre, double costo) {
        super(fabricante, marca, nombre, costo);
    }
    public boolean esParteDe(Object instancia){
        return instancia instanceof ComponenteElectronico;
    }

    @Override
    public String toString() {
        return "ComponenteElectronico:"+ super.toString();
    }
    
}
