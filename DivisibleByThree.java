import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        divisibleByThreeInRange(2, 50);
    }

    
    public static void divisibleByThreeInRange(int begining, int end){
        for(int i = begining; i <= end; i++){
            if(i % 3 ==0){
                System.out.println(i);
            }
        }
    }
}