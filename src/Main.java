import java.util.*;
public class Main {
    public static void main(String[] args)
    {   String PodstawoweSlowo, OdwroconeSlowo = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj Slowo: ");
        PodstawoweSlowo = in.nextLine().toUpperCase();
        int lenght = PodstawoweSlowo.length();
        for(int i = lenght - 1 ;i>=0; i--)
            OdwroconeSlowo = OdwroconeSlowo + PodstawoweSlowo.charAt(i);
        if (PodstawoweSlowo.equals(OdwroconeSlowo))
            System.out.println("Jest Palindromem");
        else
            System.out.println("Nie jest Palindromem");
    }
}