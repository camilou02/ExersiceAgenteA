/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgentAMODEL;

/**
 * fecha:29/10/2026 
 * objetivo: hacer el modelo de galpon
 * @author Camilo
 */
public class Shed {

    public void setName(String name) {
        this.state = name;
    }

    public void setId(int number) {
        this.number = number;
    }

    private int number;
    private String state;

    public Shed() {
    }

    public Shed(int number, String state) {
        this.number = number;
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return number + "-" + state;
    }

}
