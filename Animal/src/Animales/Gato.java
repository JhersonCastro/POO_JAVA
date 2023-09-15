/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author IngSis
 */
public class Gato extends Animal{
    private String raza;
    public Gato(String nombre, String edad, String tipoDeAlimentacion, String raza) {
        super(nombre, edad, tipoDeAlimentacion);
        this.raza = raza;
    }

    @Override
    public void sonido() {
        System.out.println("Meow meow");
    }
    
}
