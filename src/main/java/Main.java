public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person.PersonBuilder()
                .withName("Alexey")
                .withSurname("Alexeev")
                .withAge(33)
                .withCity("Moscow")
                .build();
    }
}
