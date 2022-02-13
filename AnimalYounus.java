/**
  * AnimalYounus.java
  * @author Sakeena Younus
  * @description A basic class definining an Animal Shelter
  * @version 1.0 2022-01-30
*/

/* Outside resources:
 * Worked with Kejsa Haska on creating the numberOfAnimals attribute and debugging
 * Discussed restricting animal types and errors with Chirag Aggarwal
*/

public class AnimalYounus {

  //_____attributes_____
  private final String ANIMAL;
  private final String NAME;
  private int age;
  private double weight;
  private String specialNotes = "Nothing written";
  private final int ID_NUMBER;
  private static int numberOfAnimals = 0;

  //_____methods_____
  /** constructor */
  public AnimalYounus (String animal, String name) {

    if (animal.equals("cat")) {
      animal = "cat";
    }
    else if (animal.equals("dog")) {
      animal = "dog";
    }
    else if (animal.equals("rabbit")) {
      animal = "rabbit";
    }
    else {
      animal = "other";
    } //end if statement

    ANIMAL = animal;
    NAME = name;
    ID_NUMBER = 10000 + numberOfAnimals;
    numberOfAnimals++;
  }

  /**returns ANIMAL for the instance */
    public String getAnimal() {
      return ANIMAL;
  }

  /**returns NAME for the instance */
    public String getName() {
      return NAME;
  }

  /**returns age for the instance */
    public int getAge() {
      return age;
  }

  /**returns weight for the instance */
    public double getWeight() {
      return weight;
    }

  /**returns weight for the instance */
    public String getSpecialNotes() {
      return specialNotes;
    }

  /**returns ID_NUMBER for the instance */
    public int getID_NUMBER() {
      return ID_NUMBER;
    }

  /** sets age */
    public void setAge(int age) {
          this.age =  age;
    }

  /** sets weight */
  public void setWeight(double weight) {
        this.weight =  weight;
  }

  /** sets balance */
  public void setSpecialNotes(String specialNotes) {
        this.specialNotes =  specialNotes;
  }

  /** prints information of the object */
  public String toString(){
    String s;
    s = "This " + ANIMAL + " named " + NAME;
    s += " is " + age + " years old and " + weight + " pounds.";
    s += " It's ID Number " + ID_NUMBER + " and the special notes";
    s += " concerning this " + ANIMAL + " are" + " '" + specialNotes + ".'\n";

    return s;
  }
 /** main method */
  public static void main(String[] args) {
    /** animal #1 */
    AnimalYounus animal1;
    animal1 = new AnimalYounus ("cat", "Pepper");
    animal1.setAge(1);
    animal1.setWeight(10.0);
    animal1.setSpecialNotes("Super cuddly");

    System.out.println(animal1);

    AnimalYounus animal2;
    animal2 = new AnimalYounus ("dog", "Spots");
    animal2.setAge(4);
    animal2.setWeight(20.5);
    animal2.setSpecialNotes("Eats 4 times a day");

    System.out.println(animal2);

    AnimalYounus animal3;
    animal3 = new AnimalYounus ("rabbit", "Mittens");
    animal3.setAge(3);
    animal3.setWeight(5.5);
    animal3.setSpecialNotes("Needs daily walks");

    System.out.println(animal3);

    AnimalYounus animal4;
    animal4 = new AnimalYounus ("dog", "Max");
    animal4.setAge(10);
    animal4.setWeight(40.0);
    animal4.getSpecialNotes();

    System.out.println(animal4);

    AnimalYounus animal5;
    animal5 = new AnimalYounus ("lizard", "Fred");
    animal5.setAge(15);
    animal5.setWeight(13.5);
    animal5.getSpecialNotes();

    System.out.println(animal5);
  } //end main method

}//end class
