package zrj.shiyan5;

import zrj.shiyan5.entity.Address;
import zrj.shiyan5.entity.Customer;

import java.io.*;

/**
 * 深克隆
 */
public class App2 {
    public static void main(String[] args) throws Exception{
        Customer customer=new Customer();
        Address address=new Address();
        address.setAddress("address");
        customer.setAddress(address);
        customer.setName("123");
        System.out.println(customer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(customer);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Customer customer1 = (Customer)objectInputStream.readObject();
        System.out.println(customer1);

        /**
         * Customer{name='123', address=zrj.shiyan5.entity.Address@29453f44}
         * Customer{name='123', address=zrj.shiyan5.entity.Address@d716361}
         * 引用变量地址变了
         */
    }
}
