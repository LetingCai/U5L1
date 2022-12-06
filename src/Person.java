public class Person {
    private String firstName, lastName;
    private int meeting;
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        meeting = 0;
    }

    public void meet(Person person2){
        meeting++;
        person2.meeting++;
        System.out.println("Hello my name is "+firstName+"\nHi, my name is "+person2.firstName);
    }

    public int getMeetings(){
        return meeting;
    }
public static void main(String[] args){
    Person person1 = new Person("Adam", "Jones");
    Person person2 = new Person("John", "Smith");

    person1.meet(person2);

    System.out.println(person1.getMeetings());
    System.out.println(person2.getMeetings());



    person2.meet(person1);

    System.out.println(person1.getMeetings());
    System.out.println(person2.getMeetings());



    Person person3 = new Person("Amy", "Jordan");
    person3.meet(person2);

    System.out.println(person1.getMeetings());
    System.out.println(person2.getMeetings());
    System.out.println(person3.getMeetings());
}
}
