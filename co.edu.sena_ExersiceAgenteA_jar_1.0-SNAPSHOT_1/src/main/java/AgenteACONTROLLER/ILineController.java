/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AgenteACONTROLLER;

import AgentAMODEL.Line;
import java.util.List;


/**
 * fecha:29/10/2026
 * objetivo: hacer el controlador de linea
 * @author Camilo
 */
public interface ILineController {
    
    public void insert(Line shed) throws Exception;
    public void update(Line shed) throws Exception;
    public void delete(int number) throws Exception;
    public Line find(int number) throws Exception;
    public List<Line> findAll() throws Exception;

}
