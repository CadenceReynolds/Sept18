import java.util.Scanner;

public class inputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    private static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number, enter E to get your Sum and averege: ");
            try{
                String line = input.nextLine();
                int num = Integer.parseInt(line);
                sum +=num;
                count += 1;
            } catch(Exception e) {
                break;
            }

        }

        int average = 0;
        if(count == 0){
            average = 0;
        } else{
            average = sum / count;
        }

        System.out.println("SUM = " + sum + " AVG = " + average);

    }
}
