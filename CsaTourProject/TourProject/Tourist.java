package TourProject;

import java.util.*;

public class Tourist extends Container {
    Scanner scanner = new Scanner(System.in);

    public String touristName;
    public int tourNumber;
    public int floorNum;
    public int roomNum;

    public Tourist() {
        System.out.print("Please enter your First and Last Name: ");
        touristName = scanner.nextLine();
        System.out.print("Please enter this tour number: ");
        tourNumber = scanner.nextInt();
    }

    public void setFloor() {
        System.out.print("\nWhat floor are you on?");
        System.out.print("Enter Floor Number (1, 2, 3): ");
        floorNum = scanner.nextInt();
    }

    public void setRoom() {
        System.out.print("\nWhat room are you in? ");
        System.out.print("Enter 3-digit Room Number: ");
        roomNum = scanner.nextInt();
    }

    public void enter_exit_setRoom() {
        System.out.print("What room would you like to go in? ");
        System.out.print("Enter 3-digit Room Number: ");
        roomNum = scanner.nextInt();
    }

    Container container = new Container();

    public void roomInfo() {

        //FLOOR 1 ROOM DESCRIPTIONS
        if (roomNum == 142) {
            System.out.println("This is the "+container.Floor1Rooms[0]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 144) {
            System.out.println("This is the "+container.Floor1Rooms[1]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 145) {
            System.out.println("This is the "+container.Floor1Rooms[2]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 146) {
            System.out.println("This is the "+container.Floor1Rooms[3]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 147) {
            System.out.println("This is the "+container.Floor1Rooms[4]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 181) {
            System.out.println("This is the "+container.Floor1Rooms[5]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 183) {
            System.out.println("This is the "+container.Floor1Rooms[6]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 185) {
            System.out.println("This is the "+container.Floor1Rooms[7]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 187) {
            System.out.println("This is the "+container.Floor1Rooms[8]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 189) {
            System.out.println("This is the "+container.Floor1Rooms[9]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 188) {
            System.out.println("This is the "+container.Floor1Rooms[10]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 186) {
            System.out.println("This is the "+container.Floor1Rooms[11]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 184) {
            System.out.println("This is the "+container.Floor1Rooms[12]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 116) {
            System.out.println("This is the "+container.Floor1Rooms[13]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 121) {
            System.out.println("This is the "+container.Floor1Rooms[14]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 123) {
            System.out.println("This is the "+container.Floor1Rooms[15]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 172) {
            System.out.println("This is the "+container.Floor1Rooms[16]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 191) {
            System.out.println("This is the "+container.Floor1Rooms[17]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 174) {
            System.out.println("This is the "+container.Floor1Rooms[18]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 157) {
            System.out.println("This is the "+container.Floor1Rooms[19]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 122) {
            System.out.println("This is the "+container.Floor1Rooms[21]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 124) {
            System.out.println("This is the "+container.Floor1Rooms[22]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 152) {
            System.out.println("This is the "+container.Floor1Rooms[27]);
            System.out.println("*DESCRIPTION*");
        }
        else if (roomNum == 158) {
            System.out.println("This is the "+container.Floor1Rooms[28]);
            System.out.println("*DESCRIPTION*");
        }

        //FLOOR 2 ROOM DESCRIPTIONS


        //FLOOR 3 ROOM DESCRIPTIONS
        

    }

    public void roomsAround() {
        if (roomNum == 142) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[1]+" "+container.Floor1Rooms[2]+" "+container.Floor1Rooms[3]);
        }
        else if (roomNum == 144) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[0]+" "+container.Floor1Rooms[2]+" "+container.Floor1Rooms[3]);
        }
        else if (roomNum == 145) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[1]+" "+container.Floor1Rooms[3]+" "+container.Floor1Rooms[4]);
        }
        else if (roomNum == 146) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[2]+" "+container.Floor1Rooms[4]+" "+container.Floor1Rooms[5]);
        }
        else if (roomNum == 147) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[3]+" "+container.Floor1Rooms[5]+" "+container.Floor1Rooms[6]);
        }
        else if (roomNum == 181) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[4]+" "+container.Floor1Rooms[6]+" "+container.Floor1Rooms[7]);
        }
        else if (roomNum == 183) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[5]+" "+container.Floor1Rooms[7]+" "+container.Floor1Rooms[8]);
        }
        else if (roomNum == 185) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[6]+" "+container.Floor1Rooms[8]+" "+container.Floor1Rooms[9]);
        }
        else if (roomNum == 187) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[7]+" "+container.Floor1Rooms[9]+" "+container.Floor1Rooms[10]);
        }
        else if (roomNum == 189) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[8]+" "+container.Floor1Rooms[10]+" "+container.Floor1Rooms[11]);
        }
        else if (roomNum == 188) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[9]+" "+container.Floor1Rooms[11]+" "+container.Floor1Rooms[12]);
        }
        else if (roomNum == 186) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[10]+" "+container.Floor1Rooms[12]+" "+container.Floor1Rooms[13]);
        }
        else if (roomNum == 184) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[11]+" "+container.Floor1Rooms[13]+" "+container.Floor1Rooms[14]);
        }
        else if (roomNum == 116) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[12]+" "+container.Floor1Rooms[14]+" "+container.Floor1Rooms[15]);
        }
        else if (roomNum == 121) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[13]+" "+container.Floor1Rooms[15]+" "+container.Floor1Rooms[16]);
        }
        else if (roomNum == 123) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[14]+" "+container.Floor1Rooms[16]+" "+container.Floor1Rooms[17]);
        }
        else if (roomNum == 172) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[15]+" "+container.Floor1Rooms[17]+" "+container.Floor1Rooms[18]);
        }
        else if (roomNum == 191) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[16]+" "+container.Floor1Rooms[18]+" "+container.Floor1Rooms[19]);
        }
        else if (roomNum == 174) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[17]+" "+container.Floor1Rooms[19]+" "+container.Floor1Rooms[20]);
        }
        else if (roomNum == 157) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[18]+" "+container.Floor1Rooms[20]+" "+container.Floor1Rooms[21]);
        }
        else if (roomNum == 122) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[20]+" "+container.Floor1Rooms[22]+" "+container.Floor1Rooms[23]);
        }
        else if (roomNum == 124) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[21]+" "+container.Floor1Rooms[23]+" "+container.Floor1Rooms[24]);
        }
        else if (roomNum == 152) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[26]+" "+container.Floor1Rooms[28]+" "+container.Floor1Rooms[29]);
        }
        else if (roomNum == 158) {
            System.out.println("There are these rooms around this room: "+container.Floor1Rooms[27]+" "+container.Floor1Rooms[29]+" "+container.Floor1Rooms[30]);
        }
    }

    public void setHallway() {

    }

}