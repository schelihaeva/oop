public class Main {
    public static void main(String[]args) {
        // Animal animal = new Animal("животное", 6, "рычит"); // с помощью контрутора сохраняется приватность полей
        Animal animal = new Animal(); //создали новый / пустой класс
        animal.name = "животное";    //сделали вручную то, что делает конструктор  
        animal.age = 6;
        animal.sound ="рычит";

        animal.eat();

    }
   
}
