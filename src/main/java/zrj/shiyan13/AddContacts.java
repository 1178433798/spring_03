package zrj.shiyan13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddContacts implements command{

    AdressBook adressBook;


    @Override
    public List<Contacts> execute(String name) {

        return null;
    }

    @Override
    public void execute(Contacts contacts) {
        adressBook.add(contacts);
    }
}
