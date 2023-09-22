/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import java.util.Scanner;

public class admin {
    enum options{
        RegistrarEstudiante,
        ActualizarDatosDelEstudiante,
        CrearMateria
    }
    public void administrator(){
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1- Registrar Estudiante\n2-Actualizar Datos Del Estudiante\n3-Crear Materia");
    } 
}
