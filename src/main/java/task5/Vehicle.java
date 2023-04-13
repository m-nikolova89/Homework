package task5;

public class Vehicle {
     /*
    Условие:
    Имплементирайте клас Car който extend-ва клас Vehicle:
    -   Какви instance променливи биха били подходящи ?
    -   Създайте get & set методи за всяка от тях (с подходящи валидации).
    -   Помислете какви действия биха били възможни с тях и имплементирайте логика за тях
    -   Направете конструктор с параметри
     */
     public static void main(String[] args) {

         //Creating Car object - Peugeot

         Car peugeot = new Car("Peugeot","206",2011,"Red","Petrol",
                 "Manual",1.1f);

         //Calling some actions
         peugeot.start();
         peugeot.accelerating();
         peugeot.stop();

         System.out.println("\n");

         Car tesla = new Car("Tesla","S",2021,"Black","no",
                 "Automatic",1);

         tesla.start();
         tesla.accelerating();
         tesla.stop();
         tesla.charge();
     }
}
