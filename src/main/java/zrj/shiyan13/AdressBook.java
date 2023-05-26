package zrj.shiyan13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AdressBook {
    private List<Contacts> contactsList=new ArrayList<>();


    public void add(Contacts contacts){
        contactsList.add(contacts);
        System.out.println("添加成功");
    }

    public void remove(String name){
        contactsList.forEach((item)->{
            if (item.getName().equals(name)){
                contactsList.remove(item);
                System.out.println("删除成功");
            }
        });
    }

    public List<Contacts> query(String name){
        List<Contacts> list = contactsList.stream()
                            .filter(o -> o.getName().equals(name))
                            .collect(Collectors.toList());

        return list;
    }

}
