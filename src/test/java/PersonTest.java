import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    //Arrange for methods

    Person Johan = new Person("Johan", "Zachary", "Smith", 40, Sex.M);
    Person Mary = new Person("Mary", "Smith", 35, Sex.F);

    Person Bob = new Person("Bob", "Koekoe", 12, Sex.M);
    Person Alice = new Person("Alice", "Linda", "Koekoe", 14, Sex.F);

    Person Lulu = new Person("Delulu", "Craycray", 5, Sex.M);

    Pet Yoyo = new Pet("Yoyo", 1, "Puppy");

    @Test
    void addParents() {
        //Arrange + //Act
        Bob.addParents(Mary, Johan);
        //Assert
        assertEquals(Bob.getFather(), Johan);
        assertEquals(Bob.getMother(), Mary);
    }

    @Test
    void addChild() {
        //Arrange + //Act
        Mary.addChild(Bob);

        //Assert
        assertEquals(Mary.getChildren().get(0), Bob);


    }

    @Test
    void addPet(){
        //Arrange + //Act
        Bob.addPet(Yoyo);
        //Assert
        assertEquals(Bob.getPets().get(0), Yoyo);
    }

    @Test
    void addSibling() {
        //Arrange + //Act
        Bob.addParents(Mary, Johan);
        Bob.addSibling(Alice);

        //Assert
        assertEquals(Mary.getChildren().get(1), Alice);
    }

    @Test
    void getGrandChildren() {
        //Arrange + //Act
        Bob.addChild(Lulu);
        Bob.addParents(Mary, Johan);

        //Assert
        assertEquals(Mary.getGrandChildren().get(0), Lulu);
    }
}
