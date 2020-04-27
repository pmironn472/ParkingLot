package Parking;

import Car.Car;

public class Parking {


    private byte freePlaces;
    private Car place1A;
    private Car place1B;
    private Car place1C;
    private Car place2A;
    private Car place2B;
    private Car place2C;

    public Parking() {
        this.freePlaces = 6;
    }

    public void parkCar(Car c, String place) {

        if (freePlaces == 0) {
            System.err.println("There are no available places");
        } else {
            switch (place) {
                case "1A":
                    place1A = checkingSpace(place1A, c);
                    break;
                case "1B":
                    place1B = checkingSpace(place1B, c);
                    break;
                case "1C":
                    place1C = checkingSpace(place1C, c);
                    break;
                case "2A":
                    place2A = checkingSpace(place2A, c);
                    break;
                case "2B":
                    place2B = checkingSpace(place2B, c);
                    break;
                case "2C":
                    place2C = checkingSpace(place2C, c);
                    break;
                default:
                    System.err.println("Ther is no such place");
            }
        }

    }

    public Car checkingSpace(Car s, Car c) {
        if (null == s) {
            s = c;
            freePlaces--;
        }
        return s;
    }

    public byte getFreePlaces() {
        System.out.println("There are " + freePlaces + " avaiblable places");
        return freePlaces;
    }

    public void printMap() {
        System.out.println("----------------------------");
        System.out.println("| " + Car.printModel(place1A) + "         | " + Car.printModel(place2A) + "          |");
        System.out.println("| "+ place1A.getId()+"    |            |");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("| " + Car.printModel(place1B) + "           | " + Car.printModel(place2B) + "          |");
        System.out.println("|             |            |");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("| " + Car.printModel(place1C) + "           |  " + Car.printModel(place2C) + "      |");
        System.out.println("|             |  "+ place2C.getId()+"  |");
        System.out.println("----------------------------");

    }


}




