/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

import java.sql.*;

/**
 *
 * @author cindy
 */
public class connection {
    Connection con = null;

public static Connection connect(){
try{   
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project 2","root","");
            return con;
}
catch(Exception e){System.out.println(e);}
return null;
}

}

