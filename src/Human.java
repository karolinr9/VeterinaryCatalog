import java.util.Calendar;
import java.util.ArrayList;

public class Human{

    private String name;
    private String surname;
    private int contactNumber;
    private ArrayList<Pet> petList;

    public Human(String name, String surname, int contactNumber, ArrayList<Pet> petList) {
        this.name = name;
        this.surname = surname;
        this.contactNumber = contactNumber;
        this.petList = petList;
    }

    public void addPet(Pet pet){
        petList.add(pet);
    }

    public void addPet(String name, Calendar birthDate){
        petList.add(new Pet(name, birthDate));
    }

    public void removePet(Pet pet){
        petList.remove(pet);
    }

    public void removePet(String petName){
        for (Pet p: petList) {
            if (p.getNameOfPet().compareTo(petName) == 0) {
                petList.remove(p);
            }
        }
    }

    //update pet information
    public void updateAfterVisitVet(String petName, Calendar date, String newTreatment){
        for (int i =0; i < petList.size(); i++) {
            if (petList.get(i).getNameOfPet().compareTo(petName) == 0) {
                petList.get(i).setLastVisit(date);
                petList.get(i).setPreviousTreatments(newTreatment);
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public ArrayList<Pet> getPetList() {
        return petList;
    }

    public void setPetList(ArrayList<Pet> petList) {
        this.petList = petList;
    }
}
/*
* Day 2 - Task 1

A local veterinarian wants to catalog all the pets and owners that visit him.
He has decided to build an application that will hold the information for him.

He has asked you to build a set of classes which describe all the animals and their owners.

The humans:
Name and surname
Contact number
A list of pets they own

The humans should have functions to add/remove pets, visit the vet (update pet) and update their contact info.

The pets:
A name
Date of birth (date)
Last visit (date)
List of previous treatments (string only)
Type of animal

AnimalClass types:
Name (eg. cat, dog, lizard)
Legs
Other appendages (optional - eg tail/wings)
Description

The solution does not need to build, but all classes must be without error.

You need only submit the relevant .java source files as a single archive.
*
*
*
*
*
*
* */