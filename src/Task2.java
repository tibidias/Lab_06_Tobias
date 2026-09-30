import java.util.Scanner;

class Task2{
    static void main() {
        Scanner scan = new Scanner(System.in);
        double fullBatteryCharges = 0;
        double robotOpPC = 0;
        double costPerCharge= 0;
        boolean doWhile1 = false;
        boolean doWhile2 = false;
        boolean doWhile3 = false;
        double currentTime;
        double finalCost;
        do {
            System.out.println("Enter the number of full battery charges available.");
            if(scan.hasNextDouble()){
                fullBatteryCharges = scan.nextDouble();
                if (fullBatteryCharges >= 0){
                    doWhile1 = true;
                }else {
                    System.out.println("Error enter a value greater than or equal to 0.");
                }
            }else{
                System.out.println("Error enter a valid input type.");
            }

            scan.nextLine();
        }while (!doWhile1);

        do {
            System.out.println("Enter the minutes of operation per full charge");
            if(scan.hasNextDouble()){
                robotOpPC = scan.nextDouble();
                if (robotOpPC > 0){
                    doWhile2 = true;
                }else {
                    System.out.println("Error enter a value greater than 0.");
                }
            }else{
                System.out.println("Error enter a valid input type.");
            }

            scan.nextLine();
        }while (!doWhile2);

        do {
            System.out.println("Enter the cost in dollars to recharge one full battery");
            if(scan.hasNextDouble()){
                costPerCharge = scan.nextDouble();
                if (costPerCharge > 0){
                    doWhile3 = true;
                }else {
                    System.out.println("Error enter a value greater than 0.");
                }
            }else{
                System.out.println("Error enter a valid input type.");
            }

            scan.nextLine();
        }while (!doWhile3);

        currentTime = fullBatteryCharges * robotOpPC;
        finalCost = (60 / robotOpPC) * costPerCharge;

        System.out.printf("\n%-9s%.2f%3s", "You have ", currentTime, " minutes");
        System.out.printf("\n%-20s%.2f", "Your cost per hour is $", finalCost);
    }
}
