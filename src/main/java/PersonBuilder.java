public class PersonBuilder {



    protected  String name;
    protected String surname;
    protected Integer age;
    protected String address;
    private Person newPerson;


    public PersonBuilder(){
        newPerson = new Person(name,surname);

    }
    public PersonBuilder setName(String name) {
        newPerson.name=name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        newPerson.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        newPerson.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        newPerson.address = address;
        return this;
    }

    public Person build() {
        if(newPerson.name==null||newPerson.surname==null)
            throw new IllegalStateException("обязательно указать имя и фамилию");
        else {
            if (newPerson.getAge()!=null&&newPerson.age < 0)
                throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
            return newPerson; }
}