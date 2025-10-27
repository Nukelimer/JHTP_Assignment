package Chapter_7_Exercises.Exercises.Seven_dot_19;

import java.util.Arrays;

import java.util.Scanner;

public class AirlineReservationsSystem {
/*(Airline Reservations System) A small airline has just purchased a computer for its new au-
tomated reservations system. You’ve been asked to develop the new system. You’re to write an ap-
plication to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives: Please type 1 for First Class and
Please type 2 for Economy. If the user types 1, your application should assign a seat in the first-
class section (seats 1–5). If the user types 2, your application should assign a seat in the economy
section (seats 6–10). Your application should then display a boarding pass indicating the person’s
seat number and whether it’s in the first-class or economy section of the plane.
Use a one-dimensional array of primitive type boolean to represent the seating chart of the
plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
no longer available.
Your application should never assign a seat that has already been assigned. When the economy
section is full, your application should ask the person if it’s acceptable to be placed in the first-class
section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
"Next flight leaves in 3 hours."*/
    public static void main(String[] args) {

        boolean[] airlineSeats = new boolean[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < airlineSeats.length; i++) {

            System.out.println("AIRLINE BOOKING FOR PASSENGER " + (i+1)+ ".");
            System.out.println();
            System.out.print("Please type 1 for First Class and Please type 2 for Economy: ");
            int userResponse = scanner.nextInt();
                boolean hasFilled = false;
            boolean secondClassSeatAssigned = false;
                

            if ( userResponse == 1){
                for (int first_class = 0; first_class <= 4; first_class++) {

                        if (!airlineSeats[first_class]){
                            airlineSeats[first_class] = true;
                            hasFilled = true;
                            break;
                        }

                }
                if (!hasFilled) {
                    System.out.println("First Class is full. Would you like Economy?, 1 for YES and 2 for NO");
                    int filledSection = scanner.nextInt();

                    if (filledSection == 1){

                        boolean isFilled =false;

                        for (int second_class = 5; second_class < 10; second_class++) {
                            if (!airlineSeats[second_class]){
                                airlineSeats[second_class] = true;
                                isFilled = true;
                                break;
                            }
                        }
                            if(!isFilled){
                                System.out.println("We are at capacity ooo.");
                            }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                        break;
                    }
                }

            }else if (userResponse == 2){

                for (int secondclass = 5; secondclass < 10; secondclass++) {
                  if (!airlineSeats[secondclass]){
                      airlineSeats[secondclass] = true;
                      secondClassSeatAssigned  = true;
                      break;
                  }
                }

                if (!secondClassSeatAssigned) {
                    System.out.println("Second Class is full. Would you like First Class?, 1 for YES and 2 for NO");
                    int filledSection = scanner.nextInt();
                    if (filledSection == 1){
                       boolean hasFill = false;
                        for (int first_class = 0; first_class <= 4; first_class++) {
                            if (!airlineSeats[first_class]){
                                airlineSeats[first_class] = true;
                                hasFill = true;
                                break;
                            }
                        }
                            if(!hasFill) {
                                System.out.println("We are at capacity.");
                            }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                        break;
                    }


                }

            } else {
                System.out.println("Invalid category!");
                i--;

            }
        }


        System.out.println(Arrays.toString(airlineSeats));
    }
}
