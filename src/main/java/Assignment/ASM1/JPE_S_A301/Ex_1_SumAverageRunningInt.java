/*Write a program called SumAverageRunningInt in exercise1 to produce the sum of 1, 2, 3, ..., to 100.
Store 1 and 100 in variables lowerbound and upperbound, so that we can change their values easily. Also
compute and display the average.*/


package Assignment.ASM1.JPE_S_A301;

public class Ex_1_SumAverageRunningInt {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println("Total sum is: " + sum);
        double avg = sum % 100;
        System.out.println("Average of all 100 first number " + avg);
    }
}
