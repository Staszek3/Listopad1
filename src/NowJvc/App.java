package NowJvc;

import com.sun.java_cup.internal.runtime.Symbol;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        User user1 = new User("Ala");
        user1.aadFriends("Krzysiek");
        user1.aadFriends("JAnek");
        user1.aadFriends("Krzyek");

        List<String> friends = user1.getFriends();

        System.out.println(friends);
        // System.out.println(user1.getFriends());
        friends.add("Jola");
        System.out.println(user1.getFriends());
        //isValidPesel("64091903457");
        System.out.println(isValidPesel("64091903457"));
        getGenderByPesel("64091903457");
        int[] tab1 = new int[]{478, 475, 470, 480, 481, 475, 477, 480, 482, 470};
        longJump(tab1);
    }
    // 1. Napisz metodę isValidPesel(String pesel), która sprawdzi czy podany numer pesel jest poprawny.

    public static boolean isValidPesel(String pesel) {
        System.out.println("Wpiales 11-to cyfrowy numer pesel "
                + pesel);
        // java.util.Scanner scan = new Scanner(System.in);
        if (pesel.length() != 11) {
            return false;
            //break;
        }
        int[] pes_int = new int[pesel.length()];
        char[] pes_char = pesel.toCharArray();
        for (int i = 0; i < pesel.length(); i++) {
            pes_int[i] = Character.getNumericValue(pes_char[i]);
        }
        int b = pes_int[0] + pes_int[1] * 3 + pes_int[2] * 7 + pes_int[3] * 9 + pes_int[4] + pes_int[5] * 3 +
                pes_int[6] * 7 + pes_int[7] * 9 + pes_int[8] + pes_int[9] * 3 + pes_int[10];
        if (b % 10 == 0) {
            return true;

        }
        //System.out.println("true");
        return false;
    }

    public static void getGenderByPesel(String pesel) {
        // if (pesel.length() != 11) {
        //    return false;
        //break;
        // }
        int[] pes_int = new int[pesel.length()];
        char[] pes_char = pesel.toCharArray();
        for (int i = 0; i < pesel.length(); i++) {
            pes_int[i] = Character.getNumericValue(pes_char[i]);
        }
        if (pes_int[9] % 2 == 0) {
            System.out.println("Kobieta");
        }
        System.out.println("Męższczyzna");
    }

    public static int longJump(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int d=tab[i + 1];
            int e=tab[i + 2];
            int f=tab[i + 3];

            if ((tab[i] < d) || (d < e) || (e < f)) {
                return i;
               // System.out.println("znalazłem pozytywną serie z powyżej 3 dni i rozpoczęła się od dnia " +(a-3));
            }
            int a = i;
            System.out.println("znalazłem pozytywną serie z powyżej 3 dni i rozpoczęła się od dnia " + (a - 3));
        }
        System.out.println("nie znalazłem pozytywnej serii");
    }
}
