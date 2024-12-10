package com.mycompany.parcial1;
    //import java.util.HashMap;
    import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Parcial1 {
    
    //private static HashMap<String, Cuenta> cuentas = new HashMap<>();
    private static Scanner s = new Scanner(System.in);
    
        public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n=== Restaurante ===");
            System.out.println("1. Ver menu");
            System.out.println("2. Hacer un pedido");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = s.nextInt();
            s.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> verMenu();
                case 2 -> HacerPedido();
                case 3 -> System.out.println("Gracias por venir.");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }
        
    private static void verMenu() {
            System.out.println("\n=== Menu ===");
            System.out.println("Hamburguesa: 20k");
            System.out.println("Perro Caliente: 15k");
            System.out.println("Salchipapas:  15k");
            System.out.println("Combo:  +5k");
            System.out.println("Adicional:  +3k");
    }


    private static void HacerPedido() {
            int opcion;
        do {
            System.out.println("\n=== Pedido ===");
            System.out.println("1. Hamburguesa: 20k");
            System.out.println("2. Perro Caliente: 15k");
            System.out.println("3. Salchipapas:  15k");
            System.out.println("4. Cancelar");
            System.out.print("Seleccione una opción: ");
            opcion = s.nextInt();
            s.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> MenuHamburguesa();
                case 2 -> MenuPerroCaliente();
                case 3 -> MenuSalchipapas();
                case 4 -> System.out.println("Se ha dirigido al menu principal.");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
    
    
    private static void MenuHamburguesa() {
            int opcion;
        do {
            System.out.println("\n=== Hamburgusea ===");
            System.out.println("1. Adicional de papas: +3k");
            System.out.println("2. Adicional de gaseosa +3k");
            System.out.println("3. Combo: +5k");
            System.out.println("4. Sin adicional");
            System.out.println("5. Cancelar");
            System.out.print("Seleccione una opción: ");
            opcion = s.nextInt();
            s.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> PapasHamburguesa();
                case 2 -> GaseosaHamburgesa();
                case 3 -> ComboHamburguesa();
                case 4 -> HamburguesaSola();
                case 5 -> System.out.println("Si quieres puedes seleccionar otro pedido.");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
    private static void PapasHamburguesa() {
        int costo = 23000;
        System.out.println("Ha pedido una hamburguesa con papas, el precio es: "+costo);
        System.out.println("Si quieres puedes seleccionar otra hamburguesa.");
    }
    private static void GaseosaHamburgesa() {
        int costo = 23000;
        System.out.println("Ha pedido una hamburguesa con gaseosa, el precio es: "+costo);
        System.out.println("Si quieres puedes seleccionar otra hamburguesa.");
    }
    private static void ComboHamburguesa() {
        int costo = 25000;
        System.out.println("Ha pedido una hamburguesa en combo, el precio es: "+costo);
        System.out.println("Si quieres puedes seleccionar otra hamburguesa.");
    }
    private static void HamburguesaSola() {
        int costo = 20000;
        System.out.println("Ha pedido una hamburguesa, el precio es: "+costo); 
        System.out.println("Si quieres puedes seleccionar otra hamburguesa.");
    }
    
     
    private static void MenuPerroCaliente() {
            int opcion;
        do {
            System.out.println("\n=== Perro caliente ===");
            System.out.println("1. Adicional de papas: +3k");
            System.out.println("2. Adicional de gaseosa +3k");
            System.out.println("3. Combo: +5k");
            System.out.println("4. Sin adicional");
            System.out.println("5. Cancelar");
            System.out.print("Seleccione una opción: ");
            opcion = s.nextInt();
            s.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> PapasPerro();
                case 2 -> GaseosaPerro();
                case 3 -> ComboPerro();
                case 4 -> PerroSolo();
                case 5 -> System.out.println("Si quieres puedes seleccionar otro pedido.");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
    private static void PapasPerro() {
        int costo = 18000;
        System.out.println("Ha pedido un perro con papas, el precio es: "+costo);
        System.out.println("Si quieres puedes seleccionar otro perro.");
    }
    private static void GaseosaPerro() {
        int costo = 18000;
        System.out.println("Ha pedido un perro con gaseosa, el precio es: "+costo);
        System.out.println("Si quieres puedes seleccionar otro perro.");
    }
    private static void ComboPerro() {
        int costo = 20000;
        System.out.println("Ha pedido un perro en combo, el precio es: "+costo);
        System.out.println("Si quieres puedes seleccionar otro perro.");
    }
    private static void PerroSolo() {
        int costo = 15000;
        System.out.println("Ha pedido un perro, el precio es: "+costo);  
        System.out.println("Si quieres puedes seleccionar otro perro.");
    }
    
    
    private static void MenuSalchipapas() {
            int opcion;
        do {
            System.out.println("\n=== Salchipapas ===");
            System.out.println("1. Adicional de gaseosa +3k");
            System.out.println("2. Sin adicional");
            System.out.println("3. Cancelar");
            System.out.print("Seleccione una opción: ");
            opcion = s.nextInt();
            s.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> GaseosaSalchipapas();
                case 2 -> SalchipapasSolo();
                case 3 -> System.out.println("Si quieres puedes seleccionar otro pedido.");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }
    private static void GaseosaSalchipapas() {
        int costo = 18000;
        System.out.println("Ha pedido un perro con gaseosa, el precio es: "+costo);
        System.out.println("Si quieres puedes seleccionar otra salchipapas.");
    }
    private static void SalchipapasSolo() {
        int costo = 15000;
        System.out.println("Ha pedido un perro, el precio es: "+costo);  
        System.out.println("Si quieres puedes seleccionar otra salchipapas.");
    }
    
    
}
