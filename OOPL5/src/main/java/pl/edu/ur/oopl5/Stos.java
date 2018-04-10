package pl.edu.ur.oopl5;

import java.util.Scanner;
//import jdk.internal.util.xml.impl.Input;

public class Stos {

    private int n;

    private int top = 0; // wskazuje element ze szczytu stosu
    private int stos[];

    public Stos(int n) {
        stos = new int[n+1]; 
        this.n = n;
    }

    public int peek() {
        stos[0]=0;
        if (stos.length != 0) {
            return stos[top];
        } else {
            return 0;

        }

    }

    public boolean isFull() {
        if (top == this.n) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        int x;
        
        if (!isEmpty()) {
            
            x = stos[top];
            top = top - 1;
            return x;

        }
        
        else  {
            System.out.println("Nie można zdjąć ze stosu, ponieważ jest pusty ");
            return 0;
        }

    }

    public void push(int x) {
        if (!isFull()) {
            top = top + 1;
            stos[top] = x;
        } else {
            System.out.println("Nie można położyć na stosie, ponieważ jest pełny ");

        }
    }

    public void menu() {

        Scanner input = new Scanner(System.in);

        int x = 1;

        do {

            System.out.println("MENU GLOWNE STOSU:");
            System.out.println("----------------------------");
            System.out.println("1. PUSH (dodaje element na szczyt stosu)");
            System.out.println("2. POP (usuwa element ze szczytu stosu)");
            System.out.println("3. PEEK (pokazuje wierzchołek stosu)");
            System.out.println("4. Koniec programu ");
            System.out.println("----------------------------");
            System.out.print("-> ");
            int a = input.nextInt();

            if (a == 1) {

                System.out.println("Podaj liczbę: ");
                int pu = input.nextInt();
                push(pu);
            } else if (a == 2) {
                pop();

            } else if (a == 3) {
                System.out.println(peek());

            }
            else if (a == 4) {
                x = 0;
            } else {
                System.out.println("Zły wybór!!!");
            }

        } while (x != 0);
    }

   

}
