/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS;

/**
 *
 * @author DELL
 */
public class Student {
    private String name , department;
    private double grade;

    public Student(String name, String department, double grade) {
        setName(name);
        setDepartment(department);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("")){
            this.name = "undefined";
        }else{
            this.name = name;
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if(department.equals("")){
            this.department = "undefined";
        }else{
            this.department = department;
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade>100.0f||grade<0.0f){
            this.grade = 0.0f;
        }else{
            this.grade = grade;
        }
    }
    
    
}
