import java.util.Scanner;

//Esercizio #3 ... in corso
//        Implementare i seguenti metodi
//
//
//        perimetroRettangolo che accetta la lunghezza decimale dei due lati di un rettangolo e ne calcola il perimetro
//        pariDispari che accetta un numero intero e restituisce 0 se il numero è pari e 1 se è dispari
//        perimetroTriangolo che accetta le lunghezze decimali dei lati di un triangolo e ne restituisca l'area (è possibile usare la formula di Erone)
//
//        Scrivere una main che utilizzi in sequenza i tre metodi chiedendo l'input dei dati all'utente
public class Esercizio3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        esercizio3a(input);
        System.out.println("---------------------------------------------------------------------------" );
        esercizio3b(input);
        System.out.println("---------------------------------------------------------------------------" );

    }
    public static void esercizio3a(Scanner input) {
        System.out.println("esercizio 3a : inserisci 2 valori" );
        float val1Es3a = input.nextFloat();
        float val2Es3a = input.nextFloat();
        System.out.println(perimetroRettangolo(val1Es3a , val2Es3a));

    }

    public static void esercizio3b(Scanner input){
        System.out.println("esercizio 3b : inserisci un valore intero" );
        int val1Es3b = input.nextInt();
        System.out.println(pariODispari(val1Es3b));
    }

    public static double perimetroRettangolo(double a , double b){
        return a * b;
    }
    public static int pariODispari(int a){
        return a % 2;
    }

}
