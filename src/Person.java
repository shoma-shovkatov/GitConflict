import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int balance;
    private LocalDate birthday;
    private String hobby;


    public Person(String name, String surname, int age, int balance, LocalDate birthday, String hobby) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.balance = balance;
        this.birthday = birthday;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getBalance() {
        return balance;
    }

    public String getHobby() {
        return hobby;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
