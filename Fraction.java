class Fraction {
    private int numerator, denominator;
    
    public Fraction () {
        numerator = 1;
        denominator = 2;
    }
    public Fraction (int numerator, int denominator) {
        numerator = numerator;
        if (denominator == 0) denominator = 1;
        else if (denominator != 0) denominator = denominator;
    }
    public Fraction (String fraction) {
        numerator = Integer.parseInt(fraction.substring(0, 1));
        int x = Integer.parseInt(fraction.substring(2, 3));
        if (x == 0) denominator = 1;
        else denominator = x;
    }
    public Fraction (Fraction fraction) {
        numerator = fraction.numerator;
        denominator = fraction.denominator;
    }
    public int getNum() {
        return this.numerator;
    }
    public int getDenom() {
        return this.denominator;
    }
    public String toString () {
        String returnString = new String();
        returnString = returnString + this.numerator + "/" + this.denominator;
        return returnString;
    }
    public double toDouble () {
        double i = (double) this.numerator;
        double i2 = (double) this.denominator;
        return (i/i2);
    }
   public void reduce () {
       int biggest = 0;
       if (this.numerator > this.denominator) biggest = this.numerator;
       else if (this.denominator > this.numerator) biggest = this.denominator;
       else if (this.denominator == this.numerator) biggest = this.numerator;
        for (int i = biggest; i >= 2; i--) {
            if (Math.abs(this.numerator) % i == 0 && Math.abs(this.denominator) % i == 0) {
                this.numerator = this.numerator/i;
                this.denominator = this.denominator/i;
            }
        }
   }
   public void setNum (int numerator) {
       this.numerator = numerator;
   }
   public void setDenom (int denominator) {
       this.denominator = denominator;
   }
   public static Fraction multiply (Fraction a, Fraction b) {
       Fraction finalFraction = new Fraction((a.getNum()*b.getNum()), (a.getDenom()*b.getDenom()));
       finalFraction.reduce();
       return finalFraction;
    }
    public static Fraction divide (Fraction a, Fraction b) {
       Fraction finalFraction = new Fraction((a.getNum()*b.getDenom()), (a.getDenom()*b.getNum()));
       finalFraction.reduce();
       return finalFraction;
    }
    public static Fraction add (Fraction a, Fraction b) {
       int an = a.getNum(), ad = a.getDenom(), bn = b.getNum(), bd = b.getDenom();
       a.setNum(an * bd);
       a.setDenom(ad * bd);
       b.setNum(bn * ad);
       b.setDenom(bd * ad);
       Fraction finalFraction = new Fraction((a.getNum() + b.getNum()), a.getDenom());
       finalFraction.reduce();
       return finalFraction;
    }
    public static Fraction subtract (Fraction a, Fraction b) {
       int an = a.getNum(), ad = a.getDenom(), bn = b.getNum(), bd = b.getDenom();
       a.setNum(an * bd);
       a.setDenom(ad * bd);
       b.setNum(bn * ad);
       b.setDenom(bd * ad);
       Fraction finalFraction = new Fraction((a.getNum() - b.getNum()), a.getDenom());
       finalFraction.reduce();
       return finalFraction;
    }
}    
