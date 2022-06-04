package day1;

public class Main {

    public static void main(String[] args) {
        Calculate calculate = new Calculate(1,2);
        Calculate calculate1 = new Calculate(1,2);


        System.out.println(calculate.hashCode());
        System.out.println(calculate1.hashCode());
        System.out.println(calculate.equals(calculate1));

    }

}
