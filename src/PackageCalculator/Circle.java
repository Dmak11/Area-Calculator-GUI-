package PackageCalculator;

public class Circle extends AreaCalc{
    Circle(double r){
        radius = r;
    }
    double area(){
        return 3.14*radius*radius;
    }
}
