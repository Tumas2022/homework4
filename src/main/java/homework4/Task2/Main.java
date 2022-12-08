package homework4.Task2;

public class Main {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.add(222-22-20, "Ivanov");
        phonebook.add(222-22-21, "Ivanov");
        phonebook.add(222-22-22, "Petrov");
        phonebook.add(222-22-23, "Smirnov");
        phonebook.add(222-22-24, "Smirnov");
        phonebook.add(222-22-25, "Smirnov");

        phonebook.get("Ivanov");
        phonebook.get("Petrov");
        phonebook.get("Smirnov");
        phonebook.get("Kuznetsov");
    }
}

//



