import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        do {
            System.out.println("Enter row, col");
            x = input.nextInt();}while (x < 1) ;
        int[][] myArray = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("enter myarray" + i + "-" + j);
                myArray[i][j] = input.nextInt();
            }
        }
        System.out.println("sum is "+getSum(myArray));
    }
    public static int getSum(int[][] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i][i];
        }
        return sum;
    }
}
