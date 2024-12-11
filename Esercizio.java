//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;
import java.util.Random;


// Classe principale, con metodo main
class Esercizio {
    // Main
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Inserire il numero di elementi: ");
        int n = Integer.parseInt(scanner.nextLine());
        
        // Dichiarazione degli array
        int[] u = new int[n];
        int[] r = new int[n];
        int[] s = new int[n];
        float[] m = new float[n];
        
        // Riempire il vettore U con N numeri interi positivi inseriti dall'utente
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("Inserisci il " + (i + 1) + "° numero intero positivo: ");
                u[i] = Integer.parseInt(scanner.nextLine());
                // In caso di valore negativo rifiutare l'input e far ripetere
                // l'inserimento del numero corrente
            } while (u[i] < 0);
        }
        
        // Riempire il vettore R con N numeri generati casualmente, compresi fra 0 e 10
        for (int i = 0; i < n; i++) {
            r[i] = random.nextInt(11); // Genera numeri da 0 a 10
            System.out.println("Numero casuale in [0,10] in " + (i + 1) + "° posizione: " + r[i]);
        }
        
        // Riempire il vettore S con N numeri generati casualmente, compresi fra 3 e 8
        for (int i = 0; i < n; i++) {
            s[i] = random.nextInt(6) + 3; // Genera numeri da 3 a 8
            System.out.println("Numero casuale in [3,8] in " + (i + 1) + "° posizione: " + s[i]);
        }
        
        // Riempire il vettore M tale che ogni suo elemento sia la media fra gli
        // elementi corrispondenti U, R, S. Visualizzare il contenuto di M
        for (int i = 0; i < n; i++) {
            m[i] = (u[i] + r[i] + s[i]) / 3.0;
            System.out.println((i + 1) + "° elemento media: " + m[i] + " = (" + 
                             u[i] + " + " + r[i] + " + " + s[i] + ")/3");
        }
        
        // Chiedere all'utente un numero intero T
        System.out.println("Inserire numero T");
        int t = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Elementi di U tale che la loro somma sia " + t);
        // Visualizzare tutte le coppie del vettore U tale che la loro somma sia T
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (u[i] + u[j] == t) {
                    System.out.println(u[i] + " + " + u[j] + " = " + t);
                }
            }
        }
        
        scanner.close();
        
    }
}

