package app;

import model.Direccion;
import model.Empleado;
import model.Persona;


public class Main {
    public static void main(String[] args) {

        System.out.println("===== Sistema de personas - Empresa salmonera Salmontt =====\n");

        Direccion dirPersona = new Direccion("Av. Costanera", "1234", "Puerto Montt", "Los Lagos", "Chile");
        Persona persona1 = new Persona(
                "11.111.111-1",
                "Juan Pérez",
                "juan.perez@salmontt.cl",
                "+56 9 1111 1111",
                dirPersona
        );


        Direccion dirEmpleado1 = new Direccion("Camino Chinquihue", "567", "Puerto Montt", "Los Lagos", "Chile");
        Empleado emp1 = new Empleado(
                "22.222.222-2",
                "María González",
                "maria.gonzalez@salmontt.cl",
                "+56 9 2222 2222",
                dirEmpleado1,
                "Supervisora de Planta",
                "Proceso",
                1_200_000,
                true
        );


        Direccion dirEmpleado2 = new Direccion("Ruta 5 Sur", "KM 1010", "Puerto Varas", "Los Lagos", "Chile");
        Empleado emp2 = new Empleado(
                "33.333.333-3",
                "Carlos López",
                "carlos.lopez@salmontt.cl",
                "+56 9 3333 3333",
                dirEmpleado2,
                "Coordinador Logístico",
                "Logística",
                1_000_000,
                true
        );


        System.out.println(">>> Persona registrada:");
        System.out.println(persona1);
        System.out.println();

        System.out.println(">>> Empleado #1:");
        System.out.println(emp1);
        System.out.println();

        System.out.println(">>> Empleado #2:");
        System.out.println(emp2);
        System.out.println();
    }
}
