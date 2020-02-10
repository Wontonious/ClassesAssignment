public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    Employee(int id, String firstName, String lastName, int salary){
        System.out.println("Creating employee");
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return this.firstName + " " + this.lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        if(salary<0){
            this.salary = 0;
        }
        else {
            this.salary = salary;
        }
    }
    public int getAnnualSalary(){
        salary = this.salary*12;
        return salary;
    }
    public int raiseSalary(int percent){
        salary = (1+(percent/100))*this.salary;
        return salary;
    }
    public String toString(){
        String name = this.firstName + " " + this.lastName;
        return id + " " + name + " " + salary;
    }
}
