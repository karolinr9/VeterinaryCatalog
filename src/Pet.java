import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Pet {
    private String nameOfPet;
    private Calendar birthDate;
    private Calendar lastVisit;
    private String previousTreatments;

    public Pet(String nameOfPet, Calendar birthDate) {
        this.nameOfPet = nameOfPet;
        this.birthDate = birthDate;
    }

    public String getNameOfPet() {
        return nameOfPet;
    }

    public void setNameOfPet(String nameOfPet) {
        this.nameOfPet = nameOfPet;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public Calendar getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Calendar lastVisit) {
        this.lastVisit = lastVisit;
    }

    public String getPreviousTreatments() {
        return previousTreatments;
    }

    public void setPreviousTreatments(String previousTreatments) {
        this.previousTreatments = previousTreatments;
    }
}

