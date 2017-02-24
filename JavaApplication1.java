package javaapplication1;


public class JavaApplication1 {
    public static void main(String[] args) {
        // We can call static methods from the class Fraction
        // we don't need objects because it's static
        Fraction.printDescription(); 
        
        // Instanciate Java Objects and use non-static methods
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 4);
        System.out.println(f1 + "   " + f2);
        
        // We can change member variables if they are public
        //f1.numerator = 3;
        //f1.denominator = 7;
        
        // Both these output statements do the same thing
        // The first one will call toString() implicitly
        System.out.println(f1);
        System.out.println(f1.toString()); // explicit call to toString
        
        // Float value of my fraction
        float valueF1 = f1.convertToFloat();
        System.out.println(f1 + " = " + valueF1);
        
        float valueF2 = f2.convertToFloat();
        System.out.println(f2 + " = " + valueF2);
        
        
        // add is a static method because we call it using Franction(class name)
        // the objects are passed as parameters
        Fraction result = Fraction.add(f1, f2);
        System.out.println(f1 + " + " + f2 + " = " + result);
        
        int gcd = MyMath.gcd(27, 36);
        System.out.println("The gcd of 27 and 36 is " + gcd);
        
        Fraction f = new Fraction(4, 17);
        System.out.println("original: " + f);
        
        f.setDenominator(0); // shouldn't work, invalid denominator
        f.setDenominator(16);
        System.out.println("after change: " + f);
    }
    
}
