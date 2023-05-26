package zrj.shiyan13;

import lombok.Data;

import java.util.List;

@Data
public class Invoker {
    private command addCommand;

    private command removeCommand;
    private command queryCommand;

    public void add(Contacts contacts){
        addCommand.execute(contacts);
    }

    public void remove(String name){
        removeCommand.execute(name);
    }

    public List<Contacts> query(String name){
        return queryCommand.execute(name);
    }
}
