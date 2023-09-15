/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author IngSis
 */
public class Caballo extends Animal {
    private String raza;

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }
    public Caballo(String nombre, String edad, String tipoDeAlimentacion,String raza) {
        super(nombre, edad, tipoDeAlimentacion);
        this.raza = raza;
    }

    @Override
    public void sonido() {
        System.out.println("Relincheo");
    }
    
}
