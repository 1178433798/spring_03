package zrj.shiyan8.dynamic_proxy.CG;

import zrj.shiyan8.dynamic_proxy.CG.Dao.CGSubjectDao;
import zrj.shiyan8.dynamic_proxy.Dao.Impl.SubjectImpl;
import zrj.shiyan8.dynamic_proxy.Dao.SubjectDao;
import zrj.shiyan8.dynamic_proxy.domain.entity.User;


public class app {



    public static void main(String[] args) {

        UserList.list.add(new User(1L,"wj"));
        UserList.list.add(new User(2L,"zrj"));

        CGSubjectDao subjectDao = (CGSubjectDao) CglibProxyFactory.creatCglibProxyObj(CGSubjectDao.class);
        System.out.println(subjectDao.queryById(2L));
        System.out.println(subjectDao.queryById(2L));
//        System.out.println(subjectDao.queryById(1L));
//        System.out.println(subjectDao.queryById(1L));
//        Student student = (Student) CglibProxyFactory.creatCglibProxyObj(Student.class);
//        student.handOut();

    }
}
