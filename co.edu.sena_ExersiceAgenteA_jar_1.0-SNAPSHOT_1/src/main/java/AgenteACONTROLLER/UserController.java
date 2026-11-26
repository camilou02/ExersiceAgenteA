/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgenteACONTROLLER;

import AgentAMODEL.User;
import co.edu.sena.exerciseagentea.db.DBUser;

import java.util.List;


/**
 * Fecha: 26 / 11 / 2026
 * @author camilo
 * Objetivo: controlador user
 */
public class UserController implements IUserController {
    private DBUser dbUser = new DBUser();

    @Override
    public void insert(User user) throws Exception {
        if(user == null)
        {
            throw new Exception("El usuario está vacío");
        }
        
        if(user.getDocument() == 0)
        {
            throw new Exception("El documento es obligatorio");
        }
        
        if("".equals(user.getFullame()))
        {
            throw new Exception("El nombre es obligatorio");
        }
        
        if("".equals(user.getEmail()))
        {
            throw new Exception("El correo es obligatorio");
        }
        
        if("".equals(user.getPassword()))
        {
            throw new Exception("La estado es obligatorio");
        }
        
        if(user.getRole() == null)
        {
            throw new Exception("El rol es obligatorio");
        }
        
        dbUser.insert(user);
    }

    @Override
    public void update(User user) throws Exception {
        if(user == null)
        {
            throw new Exception("El usuario está vacío");
        }
        
        if(user.getDocument() == 0)
        {
            throw new Exception("El documento es obligatorio");
        }
        
        if("".equals(user.getFullame()))
        {
            throw new Exception("El nombre es obligatorio");
        }
        
        if("".equals(user.getEmail()))
        {
            throw new Exception("El correo es obligatorio");
        }
        
        if("".equals(user.getPassword()))
        {
            throw new Exception("La estado es obligatorio");
        }
        
        if(user.getRole() == null)
        {
            throw new Exception("El rol es obligatorio");
        }
        
        //verificar existencia de la linea a actualizar
        User userExist = find(user.getId());
        if(userExist == null)
        {
            throw new Exception("No existe el registro a actualizar");
        }
        
        dbUser.update(user);
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        //verificar existencia de la linea a eliminar
        User userExist = find(id);
        if(userExist == null)
        {
            throw new Exception("No existe el registro a eliminar");
        }
        
        dbUser.delete(id);
    }

    @Override
    public User find(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        return dbUser.find(id);
    }

    @Override
    public List<User> findAll() throws Exception {
        return dbUser.findAll();
    }
    
}