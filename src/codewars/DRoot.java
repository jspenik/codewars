package codewars;

public class DRoot {

    public static int digital_root(int n) {
        /*if (n < 10) {
            return n;
        } else {
            return digital_root(n / 10 + n % 10);
        }*/
        
            return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(493193));
    }

}
