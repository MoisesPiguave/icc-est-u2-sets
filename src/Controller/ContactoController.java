package Controller;

import Modelo.Contacto;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ContactoController {

    public ContactoController() {
        runTreeContactoPorNombre();
        runTreeContactoPorTelefono();
    }

    private void runTreeContactoPorNombre() {
        Comparator<Contacto> comparadorPorNombre = new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                return c1.getNombre().compareToIgnoreCase(c2.getNombre());
            }
        };

        Set<Contacto> contactos = new TreeSet<>(comparadorPorNombre);

        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));

        System.out.println("\n--- Contactos ordenados por Nombre ---");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    private void runTreeContactoPorTelefono() {
        Comparator<Contacto> comparadorPorTelefono = new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                return c1.getTelefono().compareTo(c2.getTelefono());
            }
        };

        Set<Contacto> contactos = new TreeSet<>(comparadorPorTelefono);

        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));

        System.out.println("\n--- Contactos ordenados por Teléfono ---");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }
}
