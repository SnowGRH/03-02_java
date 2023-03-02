
package Sarkany;

public class Sarkanyfej {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int osszeg = 0;
        while (((7*x +11*y) == 145 || (11*y)< (145-7*x))) {
            y++;
           osszeg =7*x +  11*y;
            
        }
        System.out.println(osszeg);
    }
}
