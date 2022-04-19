public class Person {
    private String name;
    private String surname;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
public static class PersonBuilder{
        private Person newPerson;

        public PersonBuilder(){
            newPerson = new Person();
        }

        public PersonBuilder withName(String name){
            newPerson.name = name;
            return this;
        }

    public PersonBuilder withSurname(String surname){
        newPerson.surname = surname;
        return this;
    }
        public PersonBuilder withAge(int age){
        newPerson.age = age;
        return this;
    }
    public PersonBuilder withCity(String city){
        newPerson.city = city;
        return this;
    }
    public Person build(){
        return newPerson;
    }
}

}
