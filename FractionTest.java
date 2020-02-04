public class FractionTest {
    public static void multTest() {
        Fraction f = new Fraction(-4, -5);
        Fraction f2 = new Fraction(5, 4);
        Fraction f3 = Fraction.multiply(f, f2);
        System.out.println(f3.getNum() + "/" + f3.getDenom());
    }
    public static void divTest() {
        Fraction f = new Fraction(4, 1);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = Fraction.divide(f, f2);
        System.out.println(f3.getNum() + "/" + f3.getDenom());
    }
    public static void addTest() {
        Fraction f = new Fraction(-10, 2);
        Fraction f2 = new Fraction(-8, 4);
        Fraction f3 = Fraction.add(f, f2);
        System.out.println(f3.getNum() + "/" + f3.getDenom());
    }
    public static void subTest() {
        Fraction f = new Fraction(10, 3);
        Fraction f2 = new Fraction(2, 6);
        Fraction f3 = Fraction.subtract(f, f2);
        System.out.println(f3.getNum() + "/" + f3.getDenom());
    }
}