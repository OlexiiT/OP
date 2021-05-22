package lab6;

public class Task20 implements Task{
    
    @Override
    public double getResult(double a, double b, double c, double d) {
        return 2 * Math.log(Math.pow(b, a)) + Math.abs(Math.asin(-Math.sqrt(d/c)));
    }
    
}
