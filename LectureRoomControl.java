/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lectureroomcontrol;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class LectureRoomControl {
    public static void main(String[] args) {
      
        int studentCount = 0;
        boolean[] lights = new boolean[3]; // Three lights, initially off

        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Display menu
            System.out.println("Main Menu:");
            System.out.println("W: Add students");
            System.out.println("X: Remove students");
            System.out.println("Y: Turn on a light");
            System.out.println("Z: Turn off a light");
            System.out.println("Q: Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'W':
                    // Addition of  students
                    System.out.print("Enter the number of students to add: ");
                    int studentsToAdd = scanner.nextInt();
                    studentCount += studentsToAdd;
                    System.out.println("Total students in the room: " + studentCount);
                    break;

                case 'X':
                    // Removing of  students
                    System.out.print("Enter the number of students to remove: ");
                    int studentsToRemove = scanner.nextInt();
                    studentCount -= Math.min(studentCount, studentsToRemove);
                    System.out.println("Total students in the room: " + studentCount);
                    break;

                case 'Y':
                    
                    System.out.print("Enter the light number (1, 2, or 3): ");
                    int lightNumber = scanner.nextInt();
                    if (lightNumber >= 1 && lightNumber <= 3) {
                        lights[lightNumber - 1] = true;
                        System.out.println("Light " + lightNumber + " turned on.");
                    } else {
                        System.out.println("Invalid light number. Please choose 1, 2, or 3.");
                    }
                    break;

                case 'Z':
                   
                    System.out.print("Enter the light number (1, 2, or 3): ");
                    lightNumber = scanner.nextInt();
                    if (lightNumber >= 1 && lightNumber <= 3) {
                        lights[lightNumber - 1] = false;
                        System.out.println("Light " + lightNumber + " turned off.");
                    } else {
                        System.out.println("Invalid light number. Please choose 1, 2, or 3.");
                    }
                    break;

                case 'Q':
                    System.out.println("Exiting the program. Goodbye! and See You Soon");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 'Q');

        
        scanner.close();
    }
}

