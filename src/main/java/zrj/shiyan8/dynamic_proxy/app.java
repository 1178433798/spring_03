package zrj.shiyan8.dynamic_proxy;

import zrj.shiyan8.dynamic_proxy.Dao.Impl.SubjectImpl;
import zrj.shiyan8.dynamic_proxy.Dao.SubjectDao;
import zrj.shiyan8.dynamic_proxy.Handler.Handler;
import zrj.shiyan8.dynamic_proxy.domain.entity.User;

import java.util.ArrayList;
import java.util.List;

public class app {



    public static void main(String[] args) {

        List<User> userList=new ArrayList<>();
        userList.add(new User(1L,"wj"));
        userList.add(new User(2L,"zrj"));

//        SubjectDao subjectDao=new SubjectImpl(userList);
//        System.out.println(subjectDao.queryById(1L));

        SubjectDao subjectDao=new SubjectImpl(userList);
        Handler handler=new Handler(subjectDao);
        DynamicallyCreated dynamicallyCreated=new DynamicallyCreated(subjectDao,handler);
        SubjectDao create = (SubjectDao) dynamicallyCreated.Create();
        System.out.println(create.queryById(2L));
        System.out.println(create.queryById(2L));
        System.out.println(create.queryById(1L));
    }
}
