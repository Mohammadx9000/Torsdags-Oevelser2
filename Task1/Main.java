public class Main {

  public static void main(String[] args) {
    printAnEmptyLine();
    printString("Good Morning");
    printNameAndAge("Mohammad Moussa", 20);
  }

  public static void printAnEmptyLine(){
    System.out.println("");
  }
  public static void printString (String str){
    System.out.println(str);
  }

  public static void printNameAndAge (String name, int age){
    System.out.println("My name is " + name + ", I am " + age + " years old");
  }
}
