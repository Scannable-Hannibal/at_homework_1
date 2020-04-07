package hello;

import java.util.Scanner;

public class Greeter {
    public String sayHello() {

        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        scan.close();
        Counter count = new Counter();
        int num_of_char = count.name_len(name);

        if(num_of_char == 1){
            return "Hello, "+ name+ " I see you have abandoned your ego.";

        } else if (num_of_char > 20){
            return "Hello, "+ name+". You have a really long name.";
        } else {
            return "Hello, " + name;

        }
    }
}