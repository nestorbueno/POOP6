/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bueno
 */
public class Carro {
   private String color;
   private String marca;
   private String placa;
   
   /**
    * Constructor por defecto de la clase Coche.
    */
    public Carro(){
    }

    /**
     * Constructor que inicializa el coche con color, marca y placa.
     * 
     * @param color Color del coche
     * @param marca Marca del coche
     * @param placa Placa del coche
     */
    public Carro(String color, String marca, String placa) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }

    /**
     * Obtiene el color del coche.
     * 
     * @return color del coche
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del coche.
     * 
     * @param color Nuevo color del coche
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene la marca del coche.
     * 
     * @return marca del coche
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del coche.
     * 
     * @param marca Nueva marca del coche
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene la placa del coche.
     * 
     * @return placa del coche
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Establece la placa del coche.
     * 
     * @param placa Nueva placa del coche
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Método que simula la acción de acelerar el coche.
     */
    public void acelerar(){
        System.out.println("acelerar");
    }
    
    /**
     * Método que simula la acción de frenar el coche.
     */
    public void frenar(){
        System.out.println("frenar");
    }

    /**
     * Método que simula cargar cosas en el coche.
     * 
     * @param cosa Cantidad o tipo de carga
     * @return Carga que el coche transporta
     */
    public String carga(String cosa){
        System.out.println("cargando "+cosa);
       return cosa;
    }
    
    /**
     * Sobreescritura del método toString para mostrar los atributos del coche.
     * 
     * @return Representación en forma de cadena del coche
     */
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", placa=" + placa + '}';
    }
}