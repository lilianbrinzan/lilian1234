public class Employee {

    int empID; // это - поле ключ
    String name, address;

    public Employee(int empID, String name, String address) {
        this.empID = empID;
        this.name = name;
        this.address = address;
    }
    // слегка модифицированный метод toString
    @Override
    public String toString() {
        return this.empID + " " + this.name + " "  + this.address;
    }

}
/**
 * return "Employee{" +
 *                 "empID=" + empID +
 *                 ", name='" + name + '\'' +
 *                 ", address='" + address + '\'' +
 *                 '}';
 *
 */