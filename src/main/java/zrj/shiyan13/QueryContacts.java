package zrj.shiyan13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryContacts implements command{

    private AdressBook adressBook;

    @Override
    public List<Contacts> execute(String name) {
        List<Contacts> list = adressBook.query(name);
        return list;
    }

    @Override
    public void execute(Contacts contacts) {

    }
}
