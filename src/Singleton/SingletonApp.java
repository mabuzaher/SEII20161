/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import com.sun.javafx.applet.ExperimentalExtensions;

/**
 *
 * @author aashgar
 */
public class SingletonApp {
    public static void main(String[] args) {
        Experiment exp1 = Experiment.getExperiment();
        exp1.setData(99);
        Experiment exp2 = Experiment.getExperiment();
        exp2.setData(200);
        System.out.println("Exp1 has data of: "+ exp1.getData());
        System.out.println("Exp1 has data of: "+ exp2.getData());
    }
    
    
}
