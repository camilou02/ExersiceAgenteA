/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AgenteACONTROLLER;

import AgentAMODEL.User;
import java.util.List;


/**
 * fecha:29/10/2026
 * objetivo: hacer el controlador de linea
 * @author Camilo
 */
public interface IUserController {
    
    public void insert(User user) throws Exception;
    public void update(User user) throws Exception;
    public void delete(int id) throws Exception;
    public User find(int id) throws Exception;
    public List<User> findAll() throws Exception;

}
