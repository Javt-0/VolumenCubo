
package dominio;

/**
 *
 * @author jonat
 */
public class Cubo {
    private double ancho;
    private double alto;
    private double profundidad;
    
    //Constructor

    public Cubo() {
    }

    public Cubo(double ancho, double alto, double profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    
    //Set y Get

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cubo{");
        sb.append("ancho=").append(ancho);
        sb.append(", alto=").append(alto);
        sb.append(", profundidad=").append(profundidad);
        sb.append('}');
        return sb.toString();
    }
    
    //Metodos
    public double volumen(Cubo c){
        double vol = c.alto * c.ancho * c.profundidad;
        
        return vol;
    }
}
