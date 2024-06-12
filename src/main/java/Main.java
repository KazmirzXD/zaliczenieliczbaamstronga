
public class Main {
  public static void main(String[] args) {
    System.out.println("Liczba Amstronga z zakresu od 1-600 ");
    for (int i = 1; i <= 600; i++) {

      if (czyLiczbaAmstronga(i)) {
      
      System.out.println(i);
    }
  }
}

  public static boolean czyLiczbaAmstronga(int liczba) {

    int Sumapoteng = 0;
    int temp = liczba;
    int LiczbaCyfr = String.valueOf(liczba).length();
    while (temp != 0) {
      int cyfra = temp % 10;
      Sumapoteng += Math.pow(cyfra, LiczbaCyfr);
      temp /= 10;
    }
    return Sumapoteng == liczba;
  }
}