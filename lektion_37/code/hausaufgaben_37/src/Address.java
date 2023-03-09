public class Address extends Employee {
    private String address1;

    public Address(String name, String address, int ID_num, String address1) {
        super(name, address, ID_num);
        this.address1 = address1;
    }

    public void mailPlaySlip (){
        System.out.println("Hallo !!!");
        System.out.println("Uvajaemai " + getName() + ", neu Address ist " + getAddress());
        System.out.println("Sie haben ein neu Address " + getAddress());

    }


    public String getAddress() {
        return address1;
    }

    public void setAddress(String address) {
        this.address1 = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address1 + '\'' +
                '}';
    }

}
