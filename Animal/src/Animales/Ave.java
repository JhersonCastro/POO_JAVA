/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author IngSis
 */
public class Ave extends Animal {
    private String especie;
    public Ave(String nombre, String edad, String tipoDeAlimentacion, String especie) {
        super(nombre, edad, tipoDeAlimentacion);
        this.especie = especie;
    }

    @Override
    public void sonido() {
        System.out.println("Pio pio");
    }
    
}
