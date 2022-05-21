public class Person {
    protected String name;
    protected String surname;
    protected Integer age = null;
    protected String address;

    public Person(String name, String surname) {

        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Integer age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (age != null)
            age++;
    }

    public boolean hasAge() {
        if (age == null) {
            return false;
        } else
            return true;
    }

    public boolean hasAddress() {
        if (address == null) {
            return false;
        } else
            return true;

    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder newChild = new PersonBuilder().setSurname(this.surname).setAddress(this.address).setAge(0);
        return newChild;
    }

    @Override
    public String toString() {
        return  name + " " + surname;
    }
}