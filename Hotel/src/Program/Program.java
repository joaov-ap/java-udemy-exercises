package Program;

import entities.Hotel;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How many rooms will be rented? ");
        int rentedRooms = sc.nextInt();
        Hotel[] hotel = new Hotel[10];

        for (int i=0;i<rentedRooms;i++) {
            sc.nextLine();
            System.out.printf("Rent #%d:%n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            hotel[room] = new Hotel(name, email, room);
            System.out.println();
        }

        System.out.println("Busy rooms:");
        for (int i=0;i<hotel.length;i++) {
            if (hotel[i] != null) {
                System.out.println(hotel[i].toString());
            }
        }

        sc.close();
    }
}
