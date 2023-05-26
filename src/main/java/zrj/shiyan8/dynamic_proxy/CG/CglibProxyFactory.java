package zrj.shiyan8.dynamic_proxy.CG;

import net.sf.cglib.proxy.Enhancer;
import zrj.shiyan8.dynamic_proxy.CG.Dao.Impl.CGSubjectImpl;
import zrj.shiyan8.dynamic_proxy.Dao.Impl.SubjectImpl;
import zrj.shiyan8.dynamic_proxy.Dao.SubjectDao;
import zrj.shiyan8.dynamic_proxy.domain.entity.User;

import java.util.ArrayList;
import java.util.List;


public class CglibProxyFactory {

    public static Object creatCglibProxyObj(Class<?> clazz) {



        Enhancer enhancer = new Enhancer();
        // 为加强器指定要代理的业务类（即为下面生成的代理类指定父类）
        enhancer.setSuperclass(clazz);
        // 设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法
        enhancer.setCallback(new CgProxy(new CGSubjectImpl()));
        return enhancer.create();
    }

}
