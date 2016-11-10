/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS;

import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class dbStudent {
    private Student std;

    public dbStudent() {
        
    }
    
    
    
    private Statement aStatement;
    public boolean addStudent(Student std){
        this.std = std;
        dbConnection adbConnection= dbConnection.getdbConnection();
        try {
            this.aStatement = adbConnection.getStatement();
            this.aStatement.
           executeUpdate("INSERT INTO `students` (`name`, `department`, `grade`) VALUES (\'"+std.getName()+"\', \'"+std.getDepartment()+"\', \'"+std.getGrade()+"\')");
            
        } catch (Exception ex) {
            Logger.getLogger(dbUser.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
