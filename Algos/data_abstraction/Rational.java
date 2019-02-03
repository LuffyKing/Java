package Algos.data_abstraction;

public class Rational {
    private final long numeratorVar;
    private final long denominatorVar;
    Rational(long numerator, long denominator){
        numeratorVar = numerator;
        denominatorVar = denominator;
    }

    public Rational plus(Rational b){
        long newDenum = b.denominatorVar == denominatorVar ? denominatorVar : b.denominatorVar * denominatorVar;
        long newNum = b.denominatorVar * numeratorVar + denominatorVar* b.numeratorVar;
        long div = gcd(newNum, newDenum);
        newNum /= div;
        newDenum /= div; 
        return new Rational(newNum, newDenum);
    } 

    public Rational minus(Rational b){
        long newDenum = b.denominatorVar == denominatorVar ? denominatorVar : b.denominatorVar * denominatorVar;
        long newNum = b.denominatorVar * numeratorVar - denominatorVar* b.numeratorVar;
        long div = gcd(newNum, newDenum);
        newNum /= div;
        newDenum /= div; 
        return new Rational(newNum, newDenum);
    } 

    public Rational times(Rational b){
        long newDenum = b.denominatorVar * denominatorVar;
        long newNum = numeratorVar* b.numeratorVar;
        long div = gcd(newNum, newDenum);
        newNum /= div;
        newDenum /= div; 
        return new Rational(newNum, newDenum);
    } 

    public Rational divides(Rational b){
        long newDenum = denominatorVar * b.numeratorVar;
        long newNum = numeratorVar * b.denominatorVar;
        long div = gcd(newNum, newDenum);
        newNum /= div;
        newDenum /= div; 
        return new Rational(newNum, newDenum);
    } 


    private static long gcd(long product, long quotient){
        if (quotient == 0) {
            return product;
        }
        long remainder = product % quotient;
        return gcd(quotient, remainder);
    }

    public boolean equals(Object that){
        if (this == that) {
            return true;
        }
        if(that == null){
            return false;
        }
        if(this.getClass() != that.getClass()){
            return false;
        }
        Rational thatFinal = (Rational) that;
        if (this.numeratorVar == thatFinal.numeratorVar && this.denominatorVar == thatFinal.denominatorVar) {
            return true;
        }
        return false;
    }

    public String toString(){
        return numeratorVar+"/"+denominatorVar;
    }

    
}