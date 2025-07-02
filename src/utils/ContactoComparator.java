package utils;

import java.util.Comparator;
import Modelo.Contacto;

public class ContactoComparator implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2){
       // Primero el apellido en orden alfabetico
        int apellidoComp = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        if (apellidoComp != 0) {
            return apellidoComp;
        }

        // segundo si son iguales comparo por el nombre orden alafetico
       int comparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
       if (comparacionNombre != 0) {
            return comparacionNombre;
        }
        // comparo numeros de manera descendente
        return c2.getTelefono().compareToIgnoreCase(c1.getTelefono());
    }
}
