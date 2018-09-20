public int celsiusToFahrenheit(int a){
  return (((a * 9)/5) + 32);
}

public int fahrenheitToCelsius(int b){
  return (((a - 32) * 5) / 9);
}


public class CtoFTester {
  public static void main(String[] args ) {
    if (celsiusToFahrenheit(-10) == 14){
      if (fahrenheitToCelsius(14) == -10){
        System.out.println("-10 degrees celsius is equal to 14 degrees fahrenheit")
        System.out,println("14 degrees fahrenheit is equal to -10 degress celsius")
      }
    }
  }
}
