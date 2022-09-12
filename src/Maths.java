public class Maths {

    private static Maths maths = null;

    private Maths() {
    }

    public static Maths getInstance() {
        if (maths == null) {
            maths = new Maths();
        }
        return maths;
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }


    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}
