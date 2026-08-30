import java.util.Scanner;
public class elif{
    public static void main(String[]args){
        int score = 75;
        if(score<50)
        {
            System.out.print("you need to improve");
        }
        else if(score>=50 && score<=70)
        {
            System.out.print("good job");

        }
        else {
            System.out.print("excellent");
        }
    }
}
