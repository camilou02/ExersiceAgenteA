/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgenteACONTROLLER;

import AgentAMODEL.Line;
import Data.DataStore;
import co.edu.sena.exerciseagentea.db.DBLine;

import java.util.List;


/**
 * fecha:29/10/2026
 * objetivo: hacer el controlador de linea
 * @author Camilo
 */
public class LineController implements ILineController {
  
    private DBLine dbline = new DBLine();
    public static List<Line> lineList = DataStore.getLineList();  
    private int id;

    public LineController() {
        
    }

  @Override
public void insert(Line line) throws Exception {
    if (line == null) {
        throw new Exception("La línea está vacía");
    }

    if (line.getName() == null || "".equals(line.getName().trim())) {
        throw new Exception("El nombre es obligatorio");
    }

    //BUSCA EL PRIMER CÓDIGO LIBRE
    int number = 1;
    boolean used = true;
    while (used) {
        used = false;
        for (Line l : lineList) {
            if (l.getNumber() == number) {
                used = true;
                number++;
                break;
            }
        }
    }

    line.setNumber(number);
    lineList.add(line);
}

    @Override
    public void update(Line line) throws Exception {
        if (line == null) {
            throw new Exception("La línea está vacía");
        }

        if (line.getNumber() == 0) {
            throw new Exception("El código es obligatorio");
        }

        if ("".equals(line.getName())) {
            throw new Exception("El nombre es obligatorio");
        }

        
        boolean exists = false;
        for (int i = 0; i < lineList.size(); i++) {
            if (lineList.get(i).getNumber() == line.getNumber()) {
                lineList.set(i, line);   
                exists = true;
                break;
            }
        }

        if (!exists) {
            throw new Exception("La línea NO EXISTE!!!");
        }
    }

    @Override
    public void delete(int number) throws Exception {
        if (number == 0) {
            throw new Exception("El código es obligatorio");
        }

        
        boolean exists = false;
        for (int i = 0; i < lineList.size(); i++) {
            if (lineList.get(i).getNumber() == number) {
                lineList.remove(i);   
                exists = true;
                break;
            }
        }

        if (!exists) {
            throw new Exception("La línea NO EXISTE!!!");
        }
    }

    @Override
    public Line find(int number) throws Exception {
        if (number == 0) {
            throw new Exception("El código es obligatorio");
        }


        return dbline.find(id);
    }

    @Override
    public List<Line> findAll() throws Exception {
        return dbline.findALL();
    }
}