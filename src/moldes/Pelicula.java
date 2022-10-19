
package moldes;

public class Pelicula {
   private String Titulo;
   private String Director;
   private Double Duracion;

    public Pelicula() {
    }

    public Pelicula(String Titulo, String Director, Double Duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion = Duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public Double getDuracion() {
        return Duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + Titulo + ", Director=" + Director + ", Duracion=" + Duracion + " hr"+ '}';
    }
   
}
