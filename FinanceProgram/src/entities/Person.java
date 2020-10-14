
package entities;

import java.util.ArrayList;

public class Person {
    
    private String id;
    private String name;
    private int age;
    private ArrayList<String> jobs;
    private String gender;
    private String levelSchooling;
    public ArrayList<Income> incomes;
    public ArrayList<Expenditure> expenditures;

    public Person(String id, String name, int age, String job, String gender, String levelSchooling) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.jobs.add(job);
        this.gender = gender;
        this.levelSchooling = levelSchooling;
    }

    public Person(String id, String name, int age, String gender, String levelSchooling, ArrayList<Income> incomes, ArrayList<Expenditure> expenditures) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.levelSchooling = levelSchooling;
        this.incomes = incomes;
        this.expenditures = expenditures;
    }
    
    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getJob() {
        return jobs;
    }

    public void addJob(String job) {
        this.jobs.add(job);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLevelSchooling() {
        return levelSchooling;
    }

    public void setLevelSchooling(String levelSchooling) {
        this.levelSchooling = levelSchooling;
    }
    
    public ArrayList<Income> getIncomes(){
        return incomes;
    }
    
    public void addIncome(Income income){
        this.incomes.add(income);
    }
    
    public ArrayList<Expenditure> getExpenditures(){
        return expenditures;
    }
    
    public void addExpenditure(Expenditure expenditures){
        this.expenditures.add(expenditures);
    }
    
}
