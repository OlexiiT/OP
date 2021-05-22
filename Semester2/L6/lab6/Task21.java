package lab6;

public class Task21 implements Task{
    
    @Override
    public double getResult(double a, double b, double c, double d) {
        return 3 * (Math.log(Math.abs(a/b)) + Math.sqrt(Math.cos(c) + Math.pow(Math.E, d)));
    }
    
}
