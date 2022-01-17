package day04_Variables;

public class Square {

    public static void main(String[] args) {
        /*DataType variableName = Data;
        (My explanation: Structure:
        First, specify data type,
        Second, give one space,
        Third, write name for the variable (if the name is two word, then the first letter of the
        first word must be lower letter and the first letter of the second word
        must be upper letter (camelCase), there should be no space between the two words).
        Fourth, give one space,
        Fifth, put = (assignment operator)
        Sixth, give one space
        Seventh, data, (write down the value that you want to assign to the variable)
        Eighth, put ; (semi colon).
         */

        double side = 8.5;
        double area = side * side;
        double perimeter = side * 4;

        System.out.println("side = " + side);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }

}

/*
1. Create a class named Square, write a program that can calculate the area & perimeter of any given square
                        side (3.5)

                        area = side * side;
                        perimeter = 4 * side
 */