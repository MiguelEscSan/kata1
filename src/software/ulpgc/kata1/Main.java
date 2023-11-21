package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person pablo = new Person("Pablo", "Acosta", LocalDate.of(2003, 12, 31));
        System.out.println(pablo);
        System.out.println(pablo.getName() + " nació el " + pablo.getBirthday() + " y tiene "+ pablo.getAge()+ " años.");
    }
}
