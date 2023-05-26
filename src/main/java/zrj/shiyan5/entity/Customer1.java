package zrj.shiyan5.entity;

public class Customer1 implements Cloneable{
    private String name;
    private Address1 address;
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address1 getAddress() {
        return address;
    }
    public void setAddress(Address1 address) {
        this.address = address;
    }
}
