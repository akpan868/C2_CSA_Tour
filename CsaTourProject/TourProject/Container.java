package TourProject;

import java.util.*;

public class Container extends Main {

        String[] Floors = { "Floor 1", "Floor 2", "Floor 3" };
        String[] Floor1Hallways = { "F1 Healthcare Hallway", "Engineering Hallway", "General School Rooms",
                        "F1 Miscellaneous Rooms" };
        String[] Floor2Hallways = { "IT Hallway", "F2 Healthcare Hallway", "F2 ELA Hallway",
                        "F2 Social Studies Hallway",
                        "F2 Miscellaneous Rooms" };
        String[] Floor3Hallways = { "F3 Chemistry Hallway", "F3 Biology Hallway", "F3 Physics Hallway",
                        "F3 Math Hallway",
                        "F3 Miscellaneous Rooms" };
        String[] Floor1Rooms = { "Dummy Room (142)", "Nursing Room (144)", "Health Science Room (145)",
                        "Healthcare Room (146)", "Healthcare Room (147)", "Engineering Classroom (181)",
                        "Woodshop (183)",
                        "Storage Room (185)", "Model Shop (187)", "Engineering Classroom (189)",
                        "Engineering Classroom (188)",
                        "3D Printing Room (186)", "Engineering Classroom (184)", "Music Tech/AVTF (116)",
                        "Math Classroom (121)",
                        "Classroom (123)", "ELA Classroom (172)", "ELA Classroom (191)",
                        "Social Studies Classroom (174)",
                        "Social Studies Classroom (157)", "Front Office", "Mission Control (122)",
                        "Mission Control Two (124)",
                        "Hangar", "Launchpad", "Flight School", "Clinic", "Wellness Center (152)",
                        "Fitness Center (158)" };
        String[] Floor2Rooms = { "Cybersecurity Lab (258)", "Computer Science Lab (253)",
                        "Internet of Things Lab (251)",
                        "Embedded Computing Lab (252)", "Game Design Lab (236)", "Biotechnology Lab (224)",
                        "Biotechnology Classroom (242)", "Surgical Technology Lab (249)", "ELA Classroom (244)",
                        "ELA Classroom (246)", "ELA Classroom (263)", "ELA Classroom (265)", "ELA Classroom (267)",
                        "ELA Classroom (262)", "ELA Classroom (268)", "Social Studies Classroom (272)",
                        "Social Studies Classroom (273)", "Social Studies Classroom (274)",
                        "Social Studies Classroom (275)",
                        "Social Studies Classroom (277)", "Classroom (235)", "Classroom (233)", "Maker Space (232)",
                        "eXchange Media Center (210)", "Counseling Room (221)" };
        String[] Floor3Rooms = { "General Maker (341)", "Chemistry Lab (342)", "Chemistry Lab (345)",
                        "Chemistry Lab (346)",
                        "Chemistry Lab (349)", "Biology Lab (351)", "Biology Lab (354)", "Biology Lab (356)",
                        "Ext Learning (358)",
                        "Biology Lab (359)", "Ext Learning (361)", "Physics Lab (362)", "Physics Lab (363)",
                        "Physics Lab (364)",
                        "Physics Lab (367)", "Lecture Hall (372)", "Math Classroom (373)", "Math Classroom (375)",
                        "Math Classroom (377)", "Media Center (310)", "Extended Learning (301)", "Classroom (322)",
                        "Classroom (324)", "Classroom (331)", "Classroom (332)", "Classroom (333)", "Classroom (334)" };
        
        ArrayList<String> F1 = new ArrayList<String>();
        ArrayList<String> F2 = new ArrayList<String>();
        ArrayList<String> F3 = new ArrayList<String>();

        ArrayList<String> FloorNumber = new ArrayList<String>();

        ArrayList<String> HallwaysF1 = new ArrayList<String>();
        ArrayList<String> HallwaysF2 = new ArrayList<String>();
        ArrayList<String> HallwaysF3 = new ArrayList<String>();
        
        ArrayList<String> F1_Healthcare_Hallway = new ArrayList<String>();
        ArrayList<String> Engineering_Hallway = new ArrayList<String>();
        ArrayList<String> General_School_Rooms = new ArrayList<String>();
        ArrayList<String> F1_Miscellaneous_Rooms = new ArrayList<String>();
        ArrayList<String> IT_Hallway = new ArrayList<String>();
        ArrayList<String> F2_Healthcare_Hallway = new ArrayList<String>();
        ArrayList<String> F2_ELA_Hallway = new ArrayList<String>();
        ArrayList<String> F2_Social_Studies_Hallway = new ArrayList<String>();
        ArrayList<String> F2_Miscellaneous_Rooms = new ArrayList<String>();
        ArrayList<String> F3_Chemistry_Hallway = new ArrayList<String>();
        ArrayList<String> F3_Biology_Hallway = new ArrayList<String>();
        ArrayList<String> F3_Physics_Hallway = new ArrayList<String>();
        ArrayList<String> F3_Math_Hallway = new ArrayList<String>();
        ArrayList<String> F3_Miscellaneous_Rooms = new ArrayList<String>();

        public void FloorArrayLists() {
                for (String f1room : Floor1Rooms) {
                        for (int i = 0; i < f1room.length(); i++) {
                                if (f1room.charAt(i) == '(') {
                                        String roomNum = f1room.substring(i + 1, i + 4);
                                        F1.add(roomNum);
                                }
                        }
                }

                for (String f2room : Floor2Rooms) {
                        for (int i = 0; i < f2room.length(); i++) {
                                if (f2room.charAt(i) == '(') {
                                        String roomNum = f2room.substring(i + 1, i + 4);
                                        F2.add(roomNum);
                                }
                        }

                }

                for (String f3room : Floor3Rooms) {
                        for (int i = 0; i < f3room.length(); i++) {
                                if (f3room.charAt(i) == '(') {
                                        String roomNum = f3room.substring(i + 1, i + 4);
                                        F3.add(roomNum);
                                }
                        }

                }

                FloorNumber.add("1");
                FloorNumber.add("2");
                FloorNumber.add("3");
                
                for (String hallwaysOnF1 : Floor1Hallways) {
                        HallwaysF1.add(hallwaysOnF1);
                }

                for (String hallwaysOnF2 : Floor2Hallways) {
                        HallwaysF2.add(hallwaysOnF2);
                }

                for (String hallwaysOnF3 : Floor3Hallways) {
                        HallwaysF3.add(hallwaysOnF3);
                }
                
               
        }

        
        public void getF1Rooms() {
                for(String f1Rooms : F1) {
                        System.out.print(f1Rooms+", ");
                }
        }

        public void getF2Rooms() {

        }

        public void getF3Rooms() {

        }

}