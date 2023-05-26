package zrj.shiyan8.dynamic_proxy.CG;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import zrj.shiyan8.dynamic_proxy.CG.Dao.CGSubjectDao;
import zrj.shiyan8.dynamic_proxy.domain.entity.User;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CgProxy implements MethodInterceptor {

    private CGSubjectDao subjectDao;

    public CgProxy(CGSubjectDao subjectDao) {
        this.subjectDao = subjectDao;
    }
    private Map<Long, User> userMap=new HashMap<>();

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        Long id = (Long)objects[0] ;
        if (this.userMap.containsKey(id)) {
            System.out.println("内存中存在");
            return this.userMap.get(id) ;
        }

//        System.out.println("【增强方法】代理对象正在执行的方法：" + method.getName());
        Object result = methodProxy.invoke(subjectDao, objects);
        this.userMap.put(id,(User)result);


        return result;
    }
}
