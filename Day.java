package javaapplication1;



public class Fraction {
    // "non-static" Class Member Variables - 
    // every object will have their own values for these
    // becase these variables are not static
    
    // we want to encapsulate our member variables and use accessors
    // to get or set the value, that's why they are private
    private int numerator;
    private int denominator;
    
    // get and set accessors for numerator
    public int getNumerator()
    {
        return numerator;
    }
    
    public void setNumerator(int n)
    {
        numerator = n;
        simplify();        
    }
    
    // accessor: get
    public int getDenominator()
    {
        return denominator;
    }

    // accessor: set - called mutator in the book
    public void setDenominator(int d)
    {
        if (d != 0)
        {
            denominator = d;
            simplify();
        }
        else
        {
            System.out.println("Error: Invalid value for denominator: " + d);
        }
    }
    
    
    // "static" Class Member
    public static String desc = "This class is used for Fraction types in Java";
    
    public static void printDescription()
    {
        System.out.println(desc);
    }
    
    
    // Constructor - Must have the name of the class
    //             - No return type for constructor
    public Fraction(int n, int d)
    {
        // Initialize member variables
        numerator = n;
        denominator = d;
        
        simplify();
    }
    
    
    // Keep simplify private, this method is not accessible outside of the class
    // We want the class to simplify fractions internally
    private void simplify()
    {
        // To simplify the fraction, we can divide both the num and dem 
        // by the greatest common divisor or both numbers
        int divisor = MyMath.gcd(numerator, denominator);
        numerator /= divisor;
        denominator /= divisor;
    }
    
    public float convertToFloat()
    {
        return (float) numerator / denominator;
    }
    
    // toString will be called when concatenating
    // a fraction with a string (eg: fraction + " = ")
    public String toString()
    {
        String returnValue = numerator + "/" + denominator;
        
        return returnValue;
    }
    
    public static Fraction add(Fraction f1, Fraction f2)
    {
        int commonDenomitaor = f1.denominator * f2.denominator;
        int numerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        
        return new Fraction(numerator, commonDenomitaor);
    }
}
