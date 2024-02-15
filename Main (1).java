import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lunghezza;
        int scelta;
        int n;
        int max;
        int posizione;
        int elimina;
        System.out.println("1 Caricamento da tastiera");
        System.out.println("2 Caricamento random");
        System.out.println("3 Visualizzazione");
        System.out.println("4 Inserimento di posizione");
        System.out.println("5 Cancellazione di un elemento cercato");
        System.out.println("6 Cancellazione di tutte le occorrenze di un elemento cercato");
        System.out.println("Inserisci la lunghezza dell'array");
        lunghezza=input.nextInt();
        System.out.println("Inserisci la scelta");
        scelta=input.nextInt();
        int[] numeri=new int[100];
        switch (scelta) {
            case 1:
                System.out.println("Caricamento da tastiera");
                System.out.println("Inserisci i valori nell'array");
                for (int i = 0;i<numeri.length;i++) {
                    n=input.nextInt();
                    numeri[i]=n;
                }
                break;
            case 2:
                System.out.println("Caricamento random");
                Random generator=new Random();
                System.out.println("Inserisci il numero massimo");
                max = input.nextInt();
                for (int i=0;i<lunghezza;i++) {
                    int d=1+generator.nextInt(max);
                    System.out.println(d + "");
                    numeri[i]=d;
                }
                break;
            case 3:
                System.out.println("Visualizzazione");
                System.out.println("Inserisci i numeri nell'array");
                for (int i=0;i<lunghezza;i++) {
                    n=input.nextInt();
                    numeri[i]=n;
                }
                System.out.println("Gli elementi dell'array sono:");
                for (int i=0;i<lunghezza;i++) {
                    System.out.println(numeri[i]);
                }
                break;
            case 4:
                System.out.println("Inserimento in posizione");
                for (int i=0;i<lunghezza;i++) {
                    System.out.print("Inserisci la posizione che vuoi inserire");
                    posizione=input.nextInt();
                    System.out.print("Inserisci il numero");
                    numeri[posizione]=input.nextInt();
                }
                break;
            case 5:
                System.out.println("Cancellazione di un elemento cercato");
                System.out.println("Inserisci gli elementi nell'array");
                for (int i=0;i<lunghezza; i++) {
                    n=input.nextInt();
                    numeri[i]=n;
                }
                System.out.println("Inserisci l'elemento che vuoi eliminare");
                elimina=input.nextInt();
                for (int i=0;i<lunghezza;i++) {
                    if (numeri[i]==elimina) {
                        numeri[i]=0;
                        System.out.println("L'elemento è stato eliminato");
                    } else {
                        System.out.println("L'elemento non è nell'array");
                    }
                }
                break;
            case 6:
                System.out.println("Cancellazione di tutte le occorrenze di un elemento cercato");
                System.out.println("Inserisci gli elementi nell'array");
                for (int i = 0; i < lunghezza; i++) {
                    n = input.nextInt();
                    numeri[i]=n;
                }
                System.out.println("Inserisci l'elemento che vuoi eliminare");
                elimina=input.nextInt();
        }
    }
}