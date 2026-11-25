/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import AgentAMODEL.Line;
import AgentAMODEL.Shed;
import static AgenteACONTROLLER.ShedController.shedList;
import java.util.ArrayList;
import java.util.List;


/**
 * fecha:29/10/2026
 * objetivo: hacer la data de galpon y linea
 * @author Camilo
 */
public class DataStore {

    private static List<Shed> shedList = new ArrayList<>();
    private static List<Line> lineList = new ArrayList<>();

    static {
        // Carga inicial de datos
        shedList.add(new Shed(1, "DISPONIBLE"));
        shedList.add(new Shed(2, "DISPONIBLE"));
        shedList.add(new Shed(3, "OCUPADO"));

        lineList.add(new Line(1, "Gallina Backcock"));
        lineList.add(new Line(2, "Gallina jersey blanca gigante"));
        lineList.add(new Line(3, "Gallina Light Sussex"));
    }

    public static List<Shed> getShedList() {
        return shedList;
    }

    public static List<Line> getLineList() {
        return lineList;
    }
}