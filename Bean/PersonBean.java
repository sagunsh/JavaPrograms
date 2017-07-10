/*
    Java bean is a special class that follows certain standards. They are:
    1. It should have no argument constructor (default constructor).
    2. Should be serializable (implements java.io.Serializable interface).
    3. All properties should be private.
    4. Should have getter and setter methods for each properties.

    How bean differ from class?
    - All beans are classes, all classes are not beans.
    - Beans must have a no argument constructor, classes may not have.
    - Beans must implements Serializable, classes may not.
    - Beans have only private properties, classes may have private, public, protected or default properties.
    - Beans should have getter and setter for all properties, not compulsory for classes.
*/

public class PersonBean implements java.io.Serializable /* Implements Serializable */ {
    /* All properties are private */
    private String name;
    private int age;

    /* No argument Constructor */
    public PersonBean() {
        name = "";
        age = 0;
    }

    /* Setter methods */
    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    /* Getter methods */
    public String getName () {
        return name;
    }

    public int getAge() {
        return age;
    }

    /* Other additional methods as per requirements can be added in a bean. */
}