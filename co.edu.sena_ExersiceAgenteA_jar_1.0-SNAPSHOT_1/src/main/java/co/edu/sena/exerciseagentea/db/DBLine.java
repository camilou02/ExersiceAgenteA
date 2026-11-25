/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.db;

import AgentAMODEL.Line;
import Utils.MessageUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 * Fecha: 25 / 11 / 2026
 * @author Juan José lozano holguín
 * Objetivo: Clase para conexion a tabla line
 */
public class DBLine extends DBconnection{
    
    public void insert(Line line)
    {
        try{
            connect();
            String sql = "insert into line(name) values (?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, line.getName());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al insertar la línea " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
    }
    
    public List<Line> findALL()
    {
        List<Line> result = new ArrayList<>();
        try {
            connect();
            String query = "select * from line";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next())
            {
                Line line = new Line(resultSet.getInt("id"), resultSet.getString("name"));
                result.add(line);
            }
            resultSet.close();
            
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al consultar las líneas " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
        
        return result;
    }
}
