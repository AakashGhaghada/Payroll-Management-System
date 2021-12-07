/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_payroll;

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
        
public class db {
    
    Connection conn=null;
    public static Connection java_db(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_payroll","root","");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        }
    }
    
