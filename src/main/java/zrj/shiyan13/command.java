package zrj.shiyan13;

import java.util.List;

public interface command {

    List<Contacts> execute(String name);
    void execute(Contacts contacts);

}
