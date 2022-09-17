import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int myNumber= (int)(Math.random()*100);
        int userNumber;
        do{
            System.out.println("Guess the number:");
            userNumber=sc.nextInt();
            if(userNumber==myNumber){
                System.out.println("you win");
                break;
            } else if (userNumber<myNumber) {
                System.out.println("number is to small");
            } else {
                System.out.println("number is to big");
            }
        }while(userNumber>0);
        System.out.println("my number is:"+myNumber);

    }
}