import java.util.*;
public class salaryif {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your salary");
       int salary=sc.nextInt();
       System.out.println("enter your age");
       int age=sc.nextInt();
      
       if(salary>=20000||age<=25){
        System.out.println("you are elligible for loan");
         System.out.println("enter your loan amount");
        int loan=sc.nextInt();
        if(loan<50000)
        {
            System.out.println("loan available");
        }
        else
        {
            System.out.println("loan not available");
        }

       }
       else 
       {
        System.out.println("you are not elligible for loan");
       }
    }
    
}
