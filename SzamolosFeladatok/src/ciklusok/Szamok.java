package ciklusok;

import java.util.Scanner;

public class Szamok {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Szeretné hogy legyen szám ismétlés ? \n Igen | Nem\n");
        String valasz = sc.nextLine();
        boolean IgazHamis = valasz.equals("igen");

        for (int j = 2; j <= 4; j++) {
            for (int i = 2; i <= 4; i++) {
                for (int k = 2; k <= 4; k++) {
                    if (!IgazHamis && i != k && i != j && j != k) {
                        System.out.printf("%d%d%d\n", j, i, k);
                    }
                    System.out.printf("%d%d%d\n", j, i, k);
                }
            }
        }
    }
}
