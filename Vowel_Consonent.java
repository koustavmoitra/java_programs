import java.util.Scanner;

public class Vowel_Consonent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a alphabet..");
        char alpha = sc.next().charAt(0);

        switch (alpha) {

            case 'a':
            case 'e':
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println("vowel");
                break;

            default: {
                System.out.println("consonant");
            }

        }



    }
}
