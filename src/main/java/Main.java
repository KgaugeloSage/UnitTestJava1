import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        ArrayList<String> interests = new ArrayList<String>();
        interests.add("People");
        interests.add("Money");
        interests.add("More Money");
        interests.add("jkkkkksfhldgf");
        Person person = new Person("Ryan",30,"male", interests );
        String greeting = person.hello();
        System.out.println(greeting);
    }
}
