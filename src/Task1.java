import java.util.Scanner;

class task1{
    static void main() {
        Scanner scan = new Scanner(System.in);
        double userDistance = 0;
        boolean validDistance = false;
        double distanceM;

        do {
            System.out.println("Enter a distance in kilometers.");
            if (scan.hasNextDouble()){
                userDistance = scan.nextDouble();
                if (userDistance >= 0){
                    validDistance = true;
                }else {
                    System.out.println("Enter a valid distance.");
                }
            }else{
                System.out.println("Error: invalid input type");
            }
            scan.nextLine();
        }while (!validDistance);

        distanceM = userDistance * 0.621371;

        System.out.println("Distance:");
        System.out.printf("%-13s%7.2f", "Distance Mi: ",  distanceM);
        System.out.printf("\n%-13s%7.2f", "Distance Km:",  userDistance);


    }
}
