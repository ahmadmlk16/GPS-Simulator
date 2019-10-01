package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Algorithm:
        1. This program stimulates a broken GPS by providing the x,y coordinates of your car as you cruise at 60 mph and go either North, South , East , West at an intersection that occurs every five minutes.
        2. Declare integers x and y.
        3. Use For loop to stimulate each intersection. a total of 12 intersections should occur.
        4. Generate a random number between 1 and 4 (inclusive).
        5. If number = 1 display car travelled east and add 5 miles to x.
           Else if number = 2 display car travelled west and subtract 5 miles to x.
           Else if number = 3 display car travelled north and add 5 miles to y.
           Else if number = 4 display car travelled South and subtract 5 miles to y.
        6. Calculate total distance travelled by car using distance formula and x,y coordinates.
        7. Display car distance.
         */
        int x = 0;            // declaring initial position values
        int y = 0;
        System.out.println("The initial position of the car is (" + x + "," + y + ") at time = 0min");
        System.out.println("The car is travelling at 60 mph or 1 mile per minute.\n");  //displays initial messages

        for (int i = 5; i <= 60; i += 5) {             //loops 12 times as min increase at a rate of 5 per loop
            System.out.println("At time = " + i + "min");
            int r = (int) (Math.random() * (5 - 1)) + 1;       //finds a random number between 1-4
            if (r == 1) {
                System.out.println("Car travelled east for 5 min");      //travel east block
                x = x + 5;
                System.out.println("Car position: (" + x + "," + y + ")\n");
            } else if (r == 2) {
                System.out.println("Car travelled west for 5 min");     //travel west block
                x = x - 5;
                System.out.println("Car position: (" + x + "," + y + ")\n");
            } else if (r == 3) {
                System.out.println("Car travelled north for 5 min");   //travel north block
                y = y + 5;
                System.out.println("Car position: (" + x + "," + y + ")\n");
            } else if (r == 4) {
                System.out.println("Car travelled south for 5 min");   //travel south block
                y = y - 5;
                System.out.println("Car position: (" + x + "," + y + ")\n");
            } else break;
        }

        double totaldistance = (double) Math.sqrt((y - 0) * (y - 0) + (x - 0) * (x - 0));
        System.out.println("\n"+"After one hour total distance travelled by car between position (0,0) and ("+x+","+y+") is: "+ totaldistance + " miles.");

    }
}



