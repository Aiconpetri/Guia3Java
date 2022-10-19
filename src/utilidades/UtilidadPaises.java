
package utilidades;

import java.util.Comparator;
import moldes.Pais;

public class UtilidadPaises {
    public static Comparator <Pais> ordenNombre=new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
}
