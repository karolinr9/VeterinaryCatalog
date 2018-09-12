import java.util.Calendar;

public class Dog extends Animal {
    public Dog(String nameOfPet, Calendar birthDate, String typeOfAnimal, int legs, String description) {
        super(nameOfPet, birthDate, "Dog", 4, "Dogs are the human's best friend");
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
