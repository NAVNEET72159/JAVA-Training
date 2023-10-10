public class calculation {
    public static void main(String[] args) {
        //calculate the exponetial of any number
        // 2^100
        int base = 3;
        int power = 10;
        double exponetial = Math.pow(base, power);
        System.out.println(exponetial);

        //calculate the square root of any number
        // √100

        double root = Math.pow(100, (1/5));
        System.out.println(root);

        double root2 = Math.sqrt(base);
        System.out.println(root2);

        int diff = base - power;
        System.out.println(Math.abs(diff));

        System.out.println(Math.max(base, power));
        System.out.println(Math.min(base, power));
    }
}
/* 
 * Implicit Type Casting: 
    * Automatic Type Casting
    * int a = 3;
    * float b = a;
 * Explicit Type Casting:
    * Manual Type Casting
    * float a = 3.14f;
    * int b = (int) a;
*/