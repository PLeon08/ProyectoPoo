
package entities;

import java.util.ArrayList;

public class Family {
    
   public Address address;
   public ArrayList<Person> persons;
   private String lastName;
   private String classification;
   private int totalIncomesMonth;

    public Family(Address address, Person person, String lastName, String classification, int income) {
        this.address = address;
        this.persons.add(person);
        this.lastName = lastName;
        this.classification = classification;
        this.totalIncomesMonth = income;
    }
    
    public Family(Address address, Person person, String lastName, String classification) {
        this.address = address;
        this.persons.add(person);
        this.lastName = lastName;
        this.classification = classification;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void addPersons(Person person) {
        this.persons.add(person);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Integer getTotalIncomesMonth() {
        return totalIncomesMonth;
    }

    public void addIncomesMonth(Integer totalIncomesMonth) {
        this.totalIncomesMonth = totalIncomesMonth;
    }
   
   
   
}
