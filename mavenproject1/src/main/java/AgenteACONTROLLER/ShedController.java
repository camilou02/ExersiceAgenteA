/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgenteACONTROLLER;

import AgentAMODEL.Shed;
import static java.nio.file.Files.exists;
import java.util.ArrayList;
import java.util.List;

/**
 * fecha: 29/10/2026
 * objetivo: acomodar el controller
 * @author camilo
 */
public class ShedController implements IShedController{

    public static List<Shed> shedList = new ArrayList<>();
    
    public ShedController(){
       
    }
    
    
    @Override
    public void insert(Shed shed) throws Exception { 
        if(shed == null)
        {
            throw new Exception("El galpón está vació");
        }
        
        if(shed.getNumber() == 0)
        {
            throw new Exception("El número es obligatorio");
        }
        
        if("".equals(shed.getState()))
        {
            throw new Exception("El estado es obligatorio");
        }
        
        shedList.add(shed);
    }

    @Override
    public void update(Shed shed) throws Exception {
        if(shed == null)
        {
            throw new Exception("El galpón está vació");
        }
        
        if(shed.getNumber() == 0)
        {
            throw new Exception("El número es obligatorio");
        }
        
        if("".equals(shed.getState()))
        {
            throw new Exception("El estado es obligatorio");
        }
        
        //VERIFICAR EXISTENCIA DEL GALPÓN A ACTUALIZAR
        boolean exists = false;
        for (int i = 0; i < shedList.size(); i++) {
            if(shedList.get(i).getNumber() == shed.getNumber())
            {
                shedList.set(i, shed);   //ACTUALIZA
                exists = true;
                break;
            }
        }
        
        if(!exists)
        {
            throw new Exception("El galpón NO EXISTE!!!");
        }
    }

    @Override
    public void delete(int number) throws Exception {
        if(number == 0)
        {
            throw new Exception("El número es obligatorio");
        }
        
        //VERIFICAR EXISTENCIA DEL GALPÓN A ELIMINAR
        boolean exists = false;
        for (int i = 0; i < shedList.size(); i++) {
            if(shedList.get(i).getNumber() == number)
            {
                shedList.remove(i);   //ELIMINAR
                exists = true;
                break;
            }
        }
        
        if(!exists)
        {
            throw new Exception("El galpón NO EXISTE!!!");
        }
    }

    @Override
    public Shed find(int number) throws Exception {
        if(number == 0)
        {
            throw new Exception("El número es obligatorio");
        }
        
        Shed shed = null;  //VARIABLE TEMPORAL
        for(Shed s : shedList){
            if(s.getNumber() == number)
            {
                shed = s;
                break;
            }
        }
        
        return shed;
    }

    @Override
    public List<Shed> findAll() throws Exception {
        return shedList;
    }
}

