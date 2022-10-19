
package moldes;


public class Mascota {
    private String raza;

    public Mascota() {
    }

    public Mascota(String raza) {
        this.raza = raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Mascota{" + "raza=" + raza + '}';
    }
    
}
