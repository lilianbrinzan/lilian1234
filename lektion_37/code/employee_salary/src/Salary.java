public class Salary extends Employee {
    private double salary;

    public Salary(String name, String email, int ID_num, double salary) {
        super(name, email, ID_num);
        this.salary = salary;
    }

    public void mailPlaySlip (){
        System.out.println("eto");
        System.out.println("Uvajaemii" + getName() + ", o zarplate" + getEmail());
        System.out.println("Vasha godovaia zarplat" + getSalary());
        System.out.println("Vasha meseti zarplat" + getSalary()/12);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        //this.salary = salary;
        if (newSalary > 0) {
            salary = newSalary;
        }
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                '}';
    }
}
