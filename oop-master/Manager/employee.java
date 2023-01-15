package Manager;

import java.time.LocalDate;

public class employee {

    private int birthYear;
    private String name;
    private double salary;
    private int ID;
    int age;
    public employee(int ID, String name, int birthYear, double salary){
        this.ID=ID;
        this.birthYear=birthYear;
        this.name=name;
        this.age= LocalDate.now().getYear()-birthYear; //calculates age by getting the current year
        setSalary(salary,this.age); //uses the setSalary to calculate the correct taxation

    }
    public String getName() {
        return this.name;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthYear(int birthYear)  {
            this.birthYear = birthYear;
    }
    public void setSalary(double salary, int age){
        double tempSalary;
        if (salary*12>100000){
            tempSalary=salary*0.7;
        }
        else{
            tempSalary=salary;
        }
        if (age>30){
            this.salary=tempSalary+7500;
        }
        else if(age>22){
            this.salary=tempSalary+6000;
        }
        else{
            this.salary=tempSalary+4000;
        }
    }
    public String toString(){
        //<ID> : <Employee Name> - <birth year> ( <age> ): <Gross Salary> SEK.
        return  ID +" : "+ this.name +" - "+ this.birthYear + " ( "+age+" ): "+this.salary+" SEK";
    }
}
