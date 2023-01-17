import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("名前: ");

    String firstName = Scanner.next();

    System.out.print("名字: ");

    String lastName = Scanner.next();

    System.out.print("年齢: ");

    int age = scanner.nextint();

    System.out.print("身長: ");

    double height = scanner.nextDouble();

    System.out.print("体重(kg): ");

    double weight = scanner.nextDouble();


    Person.printData(Person.fullName(firstName, lastName), age, height, weight);
  }
}