
/**
 *
 * @author Jordan Simo
 */
public class Microprocesador extends ComponenteElectronico {
    protected int cacheRAM;
    protected long velocidadHz;

    public Microprocesador(String fabricante, String marca, String nombre, double costo) {
        super(fabricante, marca, nombre, costo);
        this.cacheRAM=123;
        this.velocidadHz=123;
    }

    @Override
    public String toString() {
        return "Microprocesador{" + super.toString()+"cacheRAM=" + cacheRAM + ", velocidadRAM=" + velocidadHz + '}';
    }

    

    public int getCacheRAM() {
        return cacheRAM;
    }

    public long getVelocidadHz() {
        return velocidadHz;
    }
    
}
