import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomInt = r.nextInt(51); //gives random # between 0 and 50
    System.out.println(randomInt);

    int randomInt2 = r.nextInt(50) + 1; 
    //gives random # between 1 and 50
    System.out.println(randomInt2);

    double randomDouble = r.nextDouble();
    //gives random # between 0.0 and 1.0
    System.out.println(randomDouble);
  }
}