// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Arrays;
import java.util.Scanner;

//Esercizio #1 FATTO
//        Implementare i seguenti metodi:
//
//        Moltiplica: accetta due interi e ritorna il loro prodotto  ---- fatto
//        Concatena: accetta una stringa e un intero e restituisce una stringa che concatena gli elementi --- fatto
//        inserisciInArray: accetta un array di stringhe di cinque elementi ed una stringa e restituisca un array di sei elementi in cui la stringa passata sia al terzo posto e le stringhe precedentemente in quarta e quinta posizione siano rispettivamente in quinta e sesta.
//
//        Scrivere una main che invochi in sequenza i tre metodi realizzati
//---------------------------------------------------------------------------------------------------------------------------------------------
//
//
//
//
public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("esercizio 1a : inserisci 2 valori");
        int val1Es1a = Integer.parseInt(input.nextLine());
        int val2Es1a = Integer.parseInt(input.nextLine());
        System.out.println("il risultato è : " + moltiplica(val1Es1a, val2Es1a));
        System.out.println("-----------------------------------");
        System.out.println("esercizio 1b : inserisci una stringa ed un valore");
        String str1es1b = input.nextLine();
        String str2es1b = input.nextLine();
        System.out.println(concatena(str1es1b , str2es1b));
        System.out.println("-----------------------------------");
        System.out.println("esercizio 1c : inserisci cinque nomi");
        String[] array1Es1c = new String[6];
        for (int i = 0 ; i < 6 ; i++){
            if(i != 2 ){
                array1Es1c[i] = input.nextLine();
            }
        }
        System.out.println(Arrays.toString(array1Es1c));
        System.out.println("esercizio 1c : inserisci nome da aggiungere");
        String str1Es1c = input.nextLine();
        System.out.println(Arrays.toString(inserisciInArray(array1Es1c, str1Es1c)));








    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concatena(String a, String b) {
        return a + b;
    }
    public static String[] inserisciInArray(String[] a , String b){
        a[2] = b;
        return a;
    }







}
