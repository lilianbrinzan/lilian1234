public abstract class Employee {

    private String name;
    private String address;
    private int ID_num;

    public Employee(String name, String address, int ID_num) {
        this.name = name;
        this.address = address;
        this.ID_num = ID_num;
    }

    public void mailPlaySlip(){
        System.out.println("eto");
        System.out.println("Uvajaemii" + this.name + "o zarplate" + this.address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ID_num=" + ID_num +
                '}';
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return address;
    }
    public int getID_num() {
        return ID_num;
    }
}
