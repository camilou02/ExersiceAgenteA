/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import AgentAMODEL.Shed;
import static AgenteACONTROLLER.ShedController.shedList;
import java.util.ArrayList;
import java.util.List;

/**
* fecha: 29/10/2026
 * objetivo: utileria data 
 * @author camilo
 */
public class DataStore {
    private static List<Shed> shedlist = new ArrayList<>();
    
    static {
         shedList.add(new Shed(1, "DISPONIBLE"));
        shedList.add(new Shed(2, "DISPONIBLE"));
        shedList.add(new Shed(3, "OCUPADO"));
    }

    public static List<Shed> getShedlist() {
        return shedlist;
    }
    
    
}
