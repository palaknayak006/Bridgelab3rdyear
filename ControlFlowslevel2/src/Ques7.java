import java.util.Scanner;
public class Ques7 {
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        int num=sc.nextInt();
        if(num>0){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    System.out.println(i);
                }
            }
        } 
    } 
  }
}