package zrj.shiyan13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RemoveContacts implements command{
    private AdressBook adressBook;

    @Override
    public List<Contacts> execute(String name) {
        adressBook.remove(name);
        return null;
    }

    @Override
    public void execute(Contacts contacts) {

    }
}
