
package examen1_oliveriraheta;


public class Escritorio extends PC{
    private int ram,storage,tipoStorage;
    private boolean grafica;

    public Escritorio() {
        super();
    }

    public Escritorio(int ram, int storage, int tipoStorage, boolean grafica, String ip, String mask, String hostname) {
        super(ip, mask, hostname);
        this.ram = ram;
        this.storage = storage;
        this.tipoStorage = tipoStorage;
        this.grafica = grafica;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getTipoStorage() {
        return tipoStorage;
    }

    public void setTipoStorage(int tipoStorage) {
        this.tipoStorage = tipoStorage;
    }

    public boolean isGrafica() {
        return grafica;
    }

    public void setGrafica(boolean grafica) {
        this.grafica = grafica;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRAM : " + ram 
                + "\nAlmacenamiento : " + storage 
                + "\nTipo de Almacenamiento : " + tipoStorage 
                + "\nTarjeta Grafica : " + grafica ;
    }
    
}
