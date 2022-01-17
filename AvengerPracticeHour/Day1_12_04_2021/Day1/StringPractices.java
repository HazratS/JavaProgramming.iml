package Day1_12_04_2021.Day1;

public class StringPractices {

    public static void main(String[] args) {
/*
        String str="Hello";
        str= str.toUpperCase();
     String s =  "" + str.charAt(0) + str.charAt(1);

        System.out.println("s = " + s);
        */

/*
        String str="Hello";
        str= str.toUpperCase();
        System.out.println("str = " + str.substring(0,2));

        String str="Hello";
      */
/*
   String str1 = "CYDEO";

   String result = str1.substring(str1.indexOf("E"));
   String lastResult=result.repeat(3);

   System.out.println(lastResult);
*/
/*
        String str1 = "CYDEO";
        int lastsecondOfChar = str1.length() - 2;
        String char = str1.substring(lastsecondOfChar);
        System.out.println(c);
*/


        String initials = "Hazrat Shah";
        char initial1 = initials.charAt(initials.lastIndexOf("h"));


        System.out.println(initial1);











    }


}
