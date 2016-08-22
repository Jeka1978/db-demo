package immutable;

/**
 * Created by Jeka on 22/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee2 anya = Employee2.builder().bonus(200).name("Anya").build();
        System.out.println(anya);
    }
}
