package polymorphism.compiletime;

public class Client {

    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(1,2); //COMPILE TIME POLYMORPHISM
        c.add(1,2,3);
    }
}
