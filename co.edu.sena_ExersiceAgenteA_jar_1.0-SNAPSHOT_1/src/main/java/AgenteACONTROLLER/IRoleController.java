/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AgenteACONTROLLER;

import AgentAMODEL.Role;
import java.util.List;


/**
 * fecha:29/10/2026
 * objetivo: hacer el controlador de rol
 * @author Camilo
 */
public interface IRoleController {
    public Role find(int id) throws Exception;
    public List<Role> findAll() throws Exception;

}
    

