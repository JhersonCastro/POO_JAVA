/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author IngSis
 */
public abstract class Animal {
    protected String nombre;
    protected String edad;
    protected String tipoDeAlimentacion;

    public Animal(String nombre, String edad, String tipoDeAlimentacion){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }
    public abstract void sonido();
}
