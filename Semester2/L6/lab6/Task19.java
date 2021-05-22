package lab6;

public class Task19 implements Task{
    
    @Override
    public double getResult(double a, double b, double c, double d) {
        return Math.pow(Math.tan(a), 1/c) / (1 + Math.sinh(b) / Math.log(Math.abs(d - c)));
    }
    
}
