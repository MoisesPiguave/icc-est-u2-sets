import Controller.ContactoController;
import Controller.Sets;
import Controller.Sets;
import utils.ContactoComparator;

import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        /*runHashSet(sets);
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSetWithComparator(sets);
        runTreeSetWithComparatorAlReves(sets);*/
        ContactoController contactoController = new ContactoController();

    }

    

    public static void runHashSet(Sets sets){
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("-----HashSet-----");
        System.out.println("Elementos del HashSet (no se garantiza orden):");
        for (String elemento : ejemploHashSet){
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet(Sets sets){
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("-----LinkedHashSet-----");
        System.out.println("Elementos del LinkedHashSet (respeta orden de inserción):");
        for (String elemento : ejemploLinkedHashSet){
            System.out.println(elemento);
        }

    }

    public static void runTreeSet(Sets sets){
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("-----TreeSet-----");
        System.out.println("Elementos del TreeSet (orden xxxxxxxx):");
        for (String elemento : ejemploTreeSet){
            System.out.println(elemento);
        }
    }

    public static void runTreeSetWithComparator(Sets sets){
        Set<String> ejemploTreeSetConComparador = sets.construirTreeSetConComparador();
        System.out.println("-----TreeSetWithComparator-----");
        System.out.println("Elementos del TreeSet Con Comparador (orden xxxxxxxx):");
        for (String elemento : ejemploTreeSetConComparador){
            System.out.println(elemento);
        }
    }

    public static void runTreeSetWithComparatorAlReves(Sets sets){
        Set<String> ejemploTreeSetConComparadorAlReves = sets.construirTreeSetConComparadorAlReves();
        System.out.println("-----TreeSetWithComparatorTurnedAround-----");
        System.out.println("Elementos del TreeSet Con Comparador al reves (orden xxxxxxxx):");
        for (String elemento : ejemploTreeSetConComparadorAlReves){
            System.out.println(elemento);
        }
    }




}

