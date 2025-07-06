public class Employee {

    private String id;
    private String name;
    private int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //getters:
    public String getId() {
        return id;
    }

    public String getName() {
        return  name;
    }

    public int getSalary () {
        return salary;
    }

    public int getAnnualSalary() {
        if(salary > 0){
            return salary * 12;
        }else{
            return 0;
        }

    }


    //setters:
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }


    //method:-
    public int raisedSalary(double percent) {
        double temp = 0;

        if(salary > 0 ){
            temp = salary * (percent/100);
            salary = (int)temp + salary;

            return salary;
        }
        else
        {
        return salary;
        }

    }

    public String toString() {
        return "Employee{" +
                "id='" + id + "\n" +
                ", name='" + name + "\n" +
                ", salary=" + salary +
                '}';
    }

}
