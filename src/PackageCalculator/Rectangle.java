package PackageCalculator;

public class Rectangle extends AreaCalc{
    Rectangle(double l, double w){
        d1 = l;
        d2 = w;
    }
    double area() {
        return d1 * d2;
    }
}
