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
public class Task20 {
    
    public static double getResult(double a, double b, double c, double d) {
        return 2 * Math.log(Math.pow(b, a)) + Math.abs(Math.asin(-Math.sqrt(d/c)));
    }
    
}
