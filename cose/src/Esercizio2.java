
import java.util.Scanner;

// Esercizio #2 fatto
// Implementare un metodo main che chiede all'utente di inserire tre stringhe da tastiera e scrive in console
// la concatenazione delle stringhe in ordine di inserimento e in ordine di inserimento inverso.

public class Esercizio2 {
    public static void  main(String[]  args){
        Scanner input = new Scanner(System.in);
        System.out.println("esercizio 2 : inserisci 3 String");
        String str1Es2 = input.nextLine();
        String str2Es2 = input.nextLine();
        String str3Es2 = input.nextLine();
        System.out.println("prima String : " + (str1Es2 + " " + str2Es2 + " " + str3Es2) +" "+  "| seconda String : " + (str3Es2 + " " + str2Es2 + " "  + str1Es2) );
    }
}
