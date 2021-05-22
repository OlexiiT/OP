/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author LioshaT
 */
public class Task19 {
    
    public static double getResult(double a, double b, double c, double d) {
        return Math.pow(Math.tan(a), 1/c) / (1 + Math.sinh(b) / Math.log(Math.abs(d - c)));
    }
    
}
