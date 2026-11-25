/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.db;

import Utils.MessageUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * descripcion clase para conexion a base de datos fecha 
 * 25/11/2026
 *
 * @author Camilo
 */
public class DBconnection {

    public static Connection connection;
    public static Statement statement;

    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DATABASE_NAME = "agentea_db";
    private final String USER = "root";
    private final String PASSWORD = "root";

    public void connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE_NAME, USER, PASSWORD);
            IO.print("jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE_NAME);
            statement = connection.createStatement();
            IO.print("\nconectado...");

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            MessageUtils.getInstance().showError("error de conexion a la base de datos" + e.getMessage());
        }
    }

    public void disconnect() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
            IO.print("\ndesconetado...");
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("error de conexion a la base de datos" + e.getMessage());
        }
    }
}
