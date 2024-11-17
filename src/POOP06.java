/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author bueno
 */
public class POOP06 {

    /**
     * Método principal que inicia la ejecución del programa.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        // Creación de objetos de la clase Coche
        Carro coche = new Carro();
        Carro coche2 = new Carro("rojo", "ford", "MXN-435");
        
        // Impresión de las representaciones en cadena de los objetos Coche
        System.out.println(coche);
        System.out.println(coche2);
    }
}
