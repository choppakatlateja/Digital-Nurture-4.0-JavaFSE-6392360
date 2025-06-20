import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Financial Forecasting.\n");
        System.out.println("Enter the Principal Amount");
        int principalAmount = sc.nextInt();

        System.out.println("Enter the Growth Rate (in %)");
        double growthRate = sc.nextDouble();
        growthRate = growthRate/100;

        System.out.println("Enter the Time Duration(in Years).");
        int time = sc.nextInt();

        System.out.printf("\nThe Future Predicted Value is: %.3f",findFutureValue(principalAmount, growthRate, time));

        sc.close();
    }
    static double findFutureValue(int principalAmount, double growthRate, int time){
        if(time==0)
        return principalAmount;
        return findFutureValue(principalAmount, growthRate, time-1)*(1+growthRate);
    }
}