package zrj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zrj.Config.SpringCongfig;
import zrj.abstractclass.IDatabaseProvider;
import zrj.abstractclass.IThirdpartyAPIProvider;
import zrj.abstractclass.IThirdpartyAuthenticationProvider;


public class App {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(SpringCongfig.class);
//        按类型获取Bean

        IDatabaseProvider databaseProvider = context.getBean(IDatabaseProvider.class);
        IThirdpartyAPIProvider thirdpartyAPIProvider = context.getBean(IThirdpartyAPIProvider.class);
        IThirdpartyAuthenticationProvider authenticationProvider = context.getBean(IThirdpartyAuthenticationProvider.class);


    }
}
