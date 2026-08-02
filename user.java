import java.util.Scanner;
public class user{
 public static void main (String[]args){
    Scanner scan =new Scanner(System.in);
    String  name=scan.nextLine();
    double score=scan.nextDouble();
    scan.nextLine();
    String department=scan.nextLine();
 System.out.println("my name is"+name);
System.out.println("my score is"+score/10);
System.out.println("my department is"+department);
    }
 }
    

