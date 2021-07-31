import java.util.*;
public class grade {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int marks;
    System.out.println("Enter your marks");
    marks = scan.nextInt();
    scan.close();

    if (marks >=70 && marks <=100) {
      System.out.println("Your grade is A");
    }else if(marks >=60 && marks <=69) {
      System.out.println("Your grade is B");
    }
    else if(marks >=50 && marks <=59) {
      System.out.println("Your grade is C");
    }
    else if(marks >=40 && marks <=49) {
      System.out.println("Your grade is D");
    }
    else if(marks >=0 && marks <=39) {
      System.out.println("Your grade is E");
    }
    else if(marks <0 || marks >100) {
      System.out.println("Marks out of scope");
    }
  

  }
}
