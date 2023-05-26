package zrj.shiyan8.dynamic_proxy.Dao.Impl;

import zrj.shiyan8.dynamic_proxy.Dao.SubjectDao;
import zrj.shiyan8.dynamic_proxy.domain.entity.User;

import java.util.List;

public class SubjectImpl implements SubjectDao {

    private List<User> userList;

    public SubjectImpl(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public User queryById(Long id) {

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId().equals(id)){
                return userList.get(i);
            }
        }
        return null;
    }
}
