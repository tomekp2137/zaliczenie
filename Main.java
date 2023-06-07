import java.util.Scanner;
import java.util.Locale;
import java.io.IOException;


class Main {
  public static void main(String[] args) {
double wynik;
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj pierwsza liczbe");
double t = scanner.nextDouble();
if( t % 2 == 0 ) System.out.println("Podana liczba jest parzysta.");
else if (t == -5) System.exit(0);
else System.out.println("Podana liczba nie jest parzysta.");
    
System.out.println("Podaj druga liczbe");
double t2 = scanner.nextDouble();
  if( t2 % 2 == 0 ) System.out.println("Podana liczba jest parzysta.");
   else if (t2 == -5) System.exit(0);
else System.out.println("Podana liczba nie jest parzysta.");

if(t2 % 2 == 0 & t % 2 == 0 ) {wynik = t*t2;
  System.out.println(wynik);}  
   else System.exit(0);




    
  }
}