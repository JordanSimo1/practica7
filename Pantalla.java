
 

/**
 *
 * @author Jordan Simo
 */
public class Pantalla extends ComponenteElectronico {
    protected int resolucionX;
    protected int resolucionY;

    public Pantalla(String fabricante, String marca, String nombre, double costo) {
        super(fabricante, marca, nombre, costo);
        this.resolucionX = 1280;
        this.resolucionY=720;
    }

    @Override
    public String toString() {
        return "Pantalla{"+super.toString() + "resolucionX=" + resolucionX + ", resolucionY=" + resolucionY + '}';
    }

    
    
    public int getResolucionX() {
        return resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }
    
}
