import java.util.Calendar;

public class Animal extends Pet {

    private String typeOfAnimal;
    private int legs;
    private String description;

    public Animal(String nameOfPet, Calendar birthDate, String typeOfAnimal, int legs, String description) {
        super(nameOfPet, birthDate);
        this.typeOfAnimal = typeOfAnimal;
        this.legs = legs;
        this.description = description;
    }

}
