public class Pet {

    //Instance Fields
    private String petName;
    private String petType;      
    private int petAge;
    private int dogSpaces;       
    private int catSpaces;      
    private int daysStay;        
    private double amountDue;    


    // Constructor
    public Pet(String petName, String petType, int petAge,
               int dogSpaces, int catSpaces, int daysStay, double amountDue) {

        this.petName = petName;
        this.petType = petType;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }


    //Getter Methods
    public String getPetName() {
        return petName;
    }

    public String getPetType() {
        return petType;
    }

    public int getPetAge() {
        return petAge;
    }

    public int getDogSpaces() {
        return dogSpaces;
    }

    public int getCatSpaces() {
        return catSpaces;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public double getAmountDue() {
        return amountDue;
    }


    //Setter Methods
    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
}
