package zrj.shiyan13;

import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        AdressBook adressBook=new AdressBook();
        Invoker invoker=new Invoker();
        command addCommand=new AddContacts(adressBook);
        command removeCommand=new RemoveContacts(adressBook);
        command queryCommand=new QueryContacts(adressBook);
        invoker.setAddCommand(addCommand);
        invoker.setRemoveCommand(removeCommand);
        invoker.setQueryCommand(queryCommand);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("A. 添加联系人信息");
            System.out.println("B. 删除联系人信息");
            System.out.println("C. 查看联系人信息");
            String s=sc.next();
            if ("A".equalsIgnoreCase(s)){
                System.out.println("请输入姓名：");
                String name= sc.next();
                System.out.println("请输入电话号码：");
                String phoneNumber=sc.next();
                invoker.add(new Contacts(name,phoneNumber));
            }else if ("B".equalsIgnoreCase(s)){
                System.out.println("请输入姓名：");
                String name= sc.next();
                invoker.remove(name);
            } else  if ("C".equalsIgnoreCase(s)){
                System.out.println("请输入姓名：");
                String name= sc.next();
                List<Contacts> query = invoker.query(name);
                query.forEach(o-> System.out.println(o));
            }else {
                System.out.println("请输入ABC");
            }
        }

    }


}
