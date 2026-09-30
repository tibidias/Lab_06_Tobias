import java.util.Scanner;
import java.lang.Math;

class Task3{
    static void main() {
        Scanner scan = new Scanner(System.in);
        double userSide1 = 0;
        double userSide2 = 0;
        double hypotenuse;
        double perimeter;
        double area;
        boolean doWhile1 = false;
        boolean doWhile2 = false;

        do{
            System.out.println("Enter the first perpendicular side of your garden.");
            if(scan.hasNextDouble()){
                userSide1 = scan.nextDouble();
                if(userSide1 > 0){
                    doWhile1 = true;
                }else{
                    System.out.println("Enter a positive variable.");
                }
            }else{
                System.out.println("Enter a double.");
            }
            scan.nextLine();
        }while(!doWhile1);


        do{
            System.out.println("Enter the second perpendicular side of your garden.");
            if(scan.hasNextDouble()){
                userSide2 = scan.nextDouble();
                if(userSide2 > 0){
                    doWhile2 = true;
                }else{
                    System.out.println("Enter a positive variable.");
                }
            }else{
                System.out.println("Enter a double.");
            }
            scan.nextLine();
        }while(!doWhile2);

        hypotenuse = Math.hypot(userSide1, userSide2);
        area =   (userSide1 * userSide2) /2;
        perimeter = hypotenuse + userSide1 + userSide2;

        System.out.printf("\n%12s%.2f%1s", "Hypotenuse: ", hypotenuse, "m");
        System.out.printf("\n%6s%.2f%2s", "Area: ", area, "m²");
        System.out.printf("\n%11s%.2f%1s", "Perimeter: ", perimeter, "m");
    }
}
