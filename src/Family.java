public class Family {
  String familyName;
  String father;
  String mother;
  String son;
  String daughter;
  String grandmother;

  public Family(String familyName, String father, String mother, String son, String daughter, String grandmother) {    this.familyName = familyName;
    this.mother = mother;
    this.father = father;
    this.son = son;
    this.daughter = daughter;
    this.grandmother = grandmother;

  }

  public void printInfo() {
    System.out.println("-----" + familyName + " family-----\n");
    System.out.println("Father: " + father + " " + familyName);
    System.out.println("Mother: " + mother + " " + familyName);
    System.out.println("Son: " + son + " " + familyName);
    System.out.println("Daughter: " + daughter + " " + familyName);
    System.out.println("Grandmother: " + grandmother + " " + familyName);
  }

  public static void main(String[] args) {
    Family NkontomireFamily = new Family("Nkontomire", "Francis", "Patience", "Fred", "Samuella", "Grace");

    NkontomireFamily.printInfo();
  }
}