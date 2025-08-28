package PackageCalculator;

public class Triangle extends AreaCalc{
    Triangle(double b, double h) {
        d1 = b;
        d2 = h;
    }
    double area(){
        return (d1 * d2)/2;
    }
}
