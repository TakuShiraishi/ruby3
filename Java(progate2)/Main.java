class Main {
  public static void main(String[] args) {
    Person person1 = new Person("kate", "jones",27,1.6,60.0,"医者");
    Person1.printData();
    Person person2 = new Person("john", "Christopher", "Smith", 65 ,1.75,80.0,"教師");
    person2.printData();
    System.out.println("------------------------");

    person1.setJob("獣医");

    System.out.println("person1の仕事を" + person1.getJob() + "に変更しました");

    person1.printData();
  }
}