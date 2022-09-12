public class Main {
    public static void main(String[] args) {
        //Maths m1 = new Maths();
        Maths m1 = Maths.getInstance();
        System.out.println("add = " + m1.add(100, 200));

        //1000 lines of code

        //Maths m2 = new Maths();
        Maths m2 = Maths.getInstance();
        System.out.println("sub = " + m2.sub(100, 200));

        //1000 lines of code

        //Maths m3 = new Maths();
        Maths m3 = Maths.getInstance();
        System.out.println("sub = " + m3.sub(900, 200));
    }
}
