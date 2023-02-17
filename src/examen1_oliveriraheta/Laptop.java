
package examen1_oliveriraheta;


public class Laptop extends PC{
    private String marca,pantalla;
    private boolean rgb;

    public Laptop() {
        super();
    }

    public Laptop(String marca, String pantalla, boolean rgb, String ip, String mask, String hostname) {
        super(ip, mask, hostname);
        this.marca = marca;
        this.pantalla = pantalla;
        this.rgb = rgb;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nMarca : "  + marca 
                + "\nPantalla : " + pantalla 
                + "\nRGB : " + rgb ;
    }
    
    
    
}
