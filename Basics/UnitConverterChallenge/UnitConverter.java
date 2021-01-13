public class UnitConverter {
  public static void main(String[] args) {
    final double fator = 5.0 / 9.0;
    final double fahrenheit = 86;
    final double celsius = (fahrenheit - 32) * fator;

    System.out.println(fahrenheit + "°F em celsius é: " + celsius + "°C");
  }
}