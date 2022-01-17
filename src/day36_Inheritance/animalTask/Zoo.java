package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

       Dog dog = new Dog();
       dog.setInfo("Max", "Husky", 'M', 2, "Small", "Black");

       dog.eat();
       dog.drink();
       dog.sleep();
       dog.move();
       dog.bark();
       // dog.hunt();
        //dog.scratch();

        System.out.println(dog);


       Cat cat = new Cat();

       cat.setInfo("Tarcin", "British", 'M', 3, "Small", "White");
       cat.eat();
       cat.sleep();
       cat.drink();
       cat.move();
       // cat.bark();
        // cat.hunt();

        System.out.println(cat);
       Tiger tiger = new Tiger();

        tiger.setInfo("Sher Khan", "Bengal",'F', 4,"Big", "Yellow");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();


        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);


    }
}
