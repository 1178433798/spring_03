package zrj.shiyan8.dynamic_proxy.CG.Dao.Impl;

import zrj.shiyan8.dynamic_proxy.CG.Dao.CGSubjectDao;
import zrj.shiyan8.dynamic_proxy.CG.UserList;
import zrj.shiyan8.dynamic_proxy.CG.app;
import zrj.shiyan8.dynamic_proxy.domain.entity.User;

import java.util.List;

public class CGSubjectImpl implements CGSubjectDao {

    @Override
    public User queryById(Long id) {
        List<User> userList = UserList.list;

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId().equals(id)){
                return userList.get(i);
            }
        }
        return null;
    }
}
