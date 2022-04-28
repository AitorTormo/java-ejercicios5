package com.java;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        Coche ford = new Coche("Ford", "Mondeo", 1995, 140.5, true);
        Coche honda = new Coche("Honda", "Civic", 2009, 190, true);
        Coche renault = new Coche("Renault", "Kangoo", 2016, 105, false);

        System.out.println(ford);
        System.out.println(honda);
        System.out.println(renault);

        // Guardar coches

        cocheCRUD.save(ford);
        cocheCRUD.save(honda);
        cocheCRUD.save(renault);

        // Consultar coches

        List<Coche> coches = cocheCRUD.findAll();
        System.out.println(coches);

        // Borrar coches

        cocheCRUD.delete(ford);
        cocheCRUD.delete(honda);
        cocheCRUD.delete(renault);








    }
}
