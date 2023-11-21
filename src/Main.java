import java.util.*;
public class Main {
    public static void Palindrom(){
        String PodstawoweSlowo, OdwroconeSlowo = ""; //Definiowanie zmiennych
        Scanner in = new Scanner(System.in); //Funkcja uzyskująca dane od użytkownika
        System.out.println("Podaj słowo"); //Prośba o podanie słowa do sprawdzenia
        PodstawoweSlowo = in.nextLine().toUpperCase(); //Zmiana wielkości liter w słowie, aby uniknąć potencjalnych nieprawidłowości
        int length = PodstawoweSlowo.length(); //Definiowanie zmiennej długości słowa
        for ( int i = length - 1; i >= 0; i-- ) //Pętra, która odwraca słowo
            OdwroconeSlowo = OdwroconeSlowo + PodstawoweSlowo.charAt(i);
        if (PodstawoweSlowo.equals(OdwroconeSlowo))//Sprawdzenie czy podane słowo jest identyczne jak otrzymane odwrócone słowo
            System.out.println("Jest palindromem");//Informacja o wyniku pozytywnym
        else
            System.out.println("Nie jest palindromem");//Informacja o wyniku negatywnym
    }

    public static void main(String[]args){
        Palindrom();
    }
} 
 