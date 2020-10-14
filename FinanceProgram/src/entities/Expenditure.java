
package entities;

public class Expenditure extends Finance{
    
    private String classification;
    
    public Expenditure(String description, String commentary, String date[], float amount, String classification){
        this.description = description;
        this.commentary = commentary;
        this.date = date;
        this.amount = amount;
        this.classification = classification;
    }
    
    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
    
}
