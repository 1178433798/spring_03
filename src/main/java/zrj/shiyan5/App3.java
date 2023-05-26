package zrj.shiyan5;

import zrj.shiyan5.entity.Address1;
import zrj.shiyan5.entity.Customer1;

/**
 * 浅克隆
 */
public class App3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer1 customer=new Customer1();
        Address1 address=new Address1();
        address.setAddress("address");
        customer.setAddress(address);
        customer.setName("123");
        System.out.println(customer);

        Customer1 clone = (Customer1) customer.clone();
        System.out.println(clone);

        /**
         * Customer{name='123', address=zrj.shiyan5.entity.Address1@29453f44}
         * Customer{name='123', address=zrj.shiyan5.entity.Address1@29453f44}
         * 引用变量地址相同
         */

    }
}
