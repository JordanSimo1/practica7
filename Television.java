
 

import java.awt.Image;

/**
 *
 * @author Jordan Simo
 */
public class Television extends DispositivoElectronicoDeConsumo {
    private Pantalla pantallaTV;
    
    public Television(String fabricante, String numeroSerie, String marca, String nombre, double costo,Pantalla newPantallaTV) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.pantallaTV = newPantallaTV;
        super.componentes.add(pantallaTV);
       
    }

    @Override
    public String toString() {
        return "Television{"+ super.toString()+ "pantallaTV=" + pantallaTV + '}';
    }

    public Pantalla getPantallaTV() {
        return pantallaTV;
    }
    
}
