public class MainProgram {
    public static void main(String[] args) {
        Person person = new Person("Ryan", 30, "male", new String[]{"being a hardarse", "agile", "ssd hard drives"});
        System.out.println(person.hello());
    }
}
