
package entities;

public class Finance {
    
    protected String description;
    protected String commentary;
    protected String date[];
    protected float amount;
    /*Constructure of class Finance that receives 4 parameters
      descripcion, represent the type of finance maked
      commentary, details of the finance
      date, receives a vector with the week, month and the year
      amount, the money price of the transaction*/
    protected Finance(String description, String commentary, String date[], float amount){
        this.description = description;
        this.commentary = commentary;
        this.date = date;
        this.amount = amount;
    }
    
    protected Finance(){
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String[] getDate() {
        return date;
    }

    public void setDate(String[] date) {
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
}
