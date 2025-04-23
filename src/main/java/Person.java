import java.util.ArrayList;
import java.util.List;

public class Person {

    private final String name;
    private String middleName = "";
    private final String lastname;
    private int age;
    private Sex sex;
    private Person mother;
    private Person father;
    private List<Person> children = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();

    public Person(String name, String lastname, int age, Sex sex) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastname, int age, Sex sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
    }

    public void addParents(Person mother, Person father) {
        setMother(mother);
        mother.addChild(this);
        setFather(father);
        father.addChild(this);
    }

    public void addChild(Person child) {
        children.add(child);
        if (sex == Sex.F) {
            child.setMother(this);
        }
        if (sex == Sex.M) {
            child.setFather(this);
        }
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void addSibling(Person sibling) {
        if (this.mother != null) {
            this.mother.addChild(sibling);
        }
        if (this.father != null) {
            this.father.addChild(sibling);
        }
    }

    public List<Person> getGrandChildren() {
        List<Person> grandChildren = new ArrayList<>();

        for (Person children : getChildren()) {
            grandChildren.addAll(children.getChildren());
        }
        return grandChildren;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
