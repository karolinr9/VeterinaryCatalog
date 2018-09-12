import java.util.ArrayList;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Human person1 = new Human("Per", "Persen", 46832950, new ArrayList<>());
        Calendar date = Calendar.getInstance();
        date.set(2010 + 1900, 10, 17);


        Pet pet1 = new Pet("Kåre", date);

        person1.addPet(pet1);
        ArrayList<Pet> petList = person1.getPetList();

        System.out.println("Person: " + person1.getName() + ". Har dyret: " + person1.getPetList());
        System.out.println("Dyr: " + petList.get(0).getNameOfPet());

        System.out.println("Hva hvis jeg skriver noe nytt");



    }

}
