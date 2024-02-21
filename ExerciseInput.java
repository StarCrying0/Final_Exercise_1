import java.util.Scanner;

public class ExerciseInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter number : ");
            arr[i] = input.nextInt();
        }
        System.out.print("The array you enter : ");
        for(int number:arr){
            System.out.print(number+" ");
        }
        input.close();
    }
}