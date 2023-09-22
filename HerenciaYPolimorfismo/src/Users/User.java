/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

/**
 *
 * @author IngSis
 */
public abstract class User {
    String name, bornDate, ID;
    public User(String name, String bornDate, String ID){
        this.name= name; this.bornDate = bornDate; this.ID = ID;
    }                
}
