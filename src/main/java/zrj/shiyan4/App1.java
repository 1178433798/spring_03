package zrj.shiyan4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zrj.shiyan4.abstractclass.Log;
import zrj.shiyan4.entity.DbLog;

public class App1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Log fileLog = (Log) ctx.getBean("FileLog");
        System.out.println(fileLog.log());


        DbLog dbLog = (DbLog) ctx.getBean("DBLog");
        System.out.println(dbLog.log());


    }
}
