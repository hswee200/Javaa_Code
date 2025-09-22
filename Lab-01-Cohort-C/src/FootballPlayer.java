import java.util.Scanner;
public class FootballPlayer {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        // Ask user for details
        System.out.print("Enter player name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        short age = input.nextShort();

        System.out.print("Enter height (in meters): ");
        float height = input.nextFloat();

        System.out.print("Enter weight (in pounds): ");
        double weight = input.nextDouble();

        System.out.print("Enter jersey number: ");
        int jerseyNumber = input.nextInt();

        // Print results
        System.out.println("\n--- Player Details ---");
        System.out.println("Player Name – " + name);
        System.out.println("Age – " + age);
        System.out.println("Height – " + height + "m");
        System.out.println("Weight – " + weight + "lbs");
        System.out.println("Jersey Number – " + jerseyNumber);

        input.close();


        // Task 2
        final double poundToKilograms = 0.45359237;
        final short  meterToCentimeters = 100;

        //Conversions
        int heightInCentimeters =(int) (height*meterToCentimeters);
        int weightInKilograms = (int) (weight*poundToKilograms);

        // Print results
        System.out.println("\n--- Player Details ---");
        System.out.println("Player Name – " + name);
        System.out.println("Age – " + age);
        System.out.println("Height – " + heightInCentimeters + "cm");
        System.out.println("Weight – " + weightInKilograms + "kg");
        System.out.println("Jersey Number – " + jerseyNumber);


        // Updated Player Details
        System.out.println("--- New Season PLayer Updates ---");
        System.out.println("Current Age – " + age);
        System.out.println("Current Jersey Number – " + jerseyNumber);
        age++;
        jerseyNumber--;

        System.out.println(" New Age – " + age);
        System.out.println("New Jersey Number – " + jerseyNumber);


        //Task 4
        //Player Eligibility
        //The player must be at least 18 years old.
        //The player must not be older than 35.
        //The player’s weight must be less than 90 kg.

        boolean eligibility =(age >= 18 && age <= 35 && weightInKilograms <90);
        if (eligibility)
            System.out.println("Player is eligible to play.");
        else
            System.out.println("Player not eligible to play.");
        boolean problem = (age < 18 || weightInKilograms >= 90);
        if (problem)
            System.out.println("Player has a problem (either too young or too heavy)");

        if (!eligibility)
            System.out.println("Not Eligible. ");



        //Task 5
        //Player Category
        String category;
        if (age<20)
            category = "Rising Star";
        else if (age <= 30) {
            category = "Prime Player";
        }
        else category = "Veteran";

        System.out.println("Player Category" + category);


        //Task 6
        //Player position
        switch (jerseyNumber){
            case(1):
                System.out.println("Goal Keeper");break;
            case(2):
                System.out.println("Defender");break;
            case (5):
                System.out.println("Defender");break;
            case (6):
                System.out.println("Midfielder");break;
            case (7):
                System.out.println("Winger");break;
            case (8):
                System.out.println("Midfielder");break;
            case (9):
                System.out.println("Striker");break;
            case (10):
                System.out.println("Playmaker");break;
            case (11):
                System.out.println("Winger");break;
            default:
                System.out.println("Player Position not found.");
        }


        //Task 7
        //Part A
        switch (jerseyNumber){
            case(1):
                System.out.println("Goal Keeper");break;
            case(2):
                System.out.println("Defender");
            case (5):
                System.out.println("Defender");break;
            case (6):
                System.out.println("midfielder");
            case (7):
                System.out.println("Winger");
            case (8):
                System.out.println("Midfielder");break;
            case (9):
                System.out.println("Striker");break;
            case (10):
                System.out.println("Playmaker");break;
            case (11):
                System.out.println("Winger");break;
            default:
                System.out.println("Player Position not found.");
        }

        //Part B
        switch (jerseyNumber){
            case 1:
                System.out.println("Goal Keeper");break;
            case 2, 5:
                System.out.println("Defender");break;
            case 6, 8:
                System.out.println("Midfielder");break;
            case 7, 11:
                System.out.println("Winger");break;
            case 9:
                System.out.println("Striker");break;
            case 10:
                System.out.println("Playmaker");break;
            default:
                System.out.println("Player Position not found.");
        }


        //Task 8
        //Selecting Starting line up
        System.out.println("\n--- Lineup Decision ---");
        if(category.equals("Prime Player")){
            if (weight <80)
                System.out.println("Starting Line Up");
            else
                System.out.println("Bench");
        } else
            System.out.println("Bench");


        //Task 9
        //Final Player Status
        String finalStatus = eligibility?"Play":"Rest";
        System.out.println("Final Decision: " + finalStatus);
    }
}
