import java.util.Scanner;

//Esercizio #3
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
        System.out.println("esercizio 3a : inserisci 2 valori" );
        float val1Es3 = input.nextFloat();
        float val2Es3 = input.nextFloat();
        System.out.println(perimetroRettangolo(val1Es3 , val2Es3));
    }

    public static double perimetroRettangolo(double a , double b){
        return a * b;
    }

}
