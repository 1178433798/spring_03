package zrj.shiyan8.dynamic_proxy.Handler;

import zrj.shiyan8.dynamic_proxy.Dao.SubjectDao;
import zrj.shiyan8.dynamic_proxy.domain.entity.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Handler implements InvocationHandler {

    private SubjectDao subjectDao;
    private Map<Long, User> userMap=new HashMap<>();

    public Handler(SubjectDao subjectDao) {
        this.subjectDao = subjectDao;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Long id = (Long)args[0] ;
        if (this.userMap.containsKey(id)) {
            System.out.println("内存中存在");
            return this.userMap.get(id) ;
        }else {
            Object ret = method.invoke(this.subjectDao, args);
            this.userMap.put(id,(User)ret);
            return ret;
        }
    }
}
