package interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Client {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.walk();


        List<Integer> x = new ArrayList<>();
        List<Integer> y = new LinkedList<>();


    }
}
