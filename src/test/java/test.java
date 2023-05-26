import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zrj.Config.SpringCongfig;
import zrj.abstractclass.IDatabaseProvider;
import zrj.abstractclass.IThirdpartyAPIProvider;
import zrj.abstractclass.QQlogin;
import zrj.abstractclass.WeiXinLogin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringCongfig.class)
public class test {

    @Autowired
    private IDatabaseProvider databaseProvider;
    @Autowired
    private QQlogin qQlogin;
    @Autowired
    private IThirdpartyAPIProvider apiProvider;
    @Autowired
    private WeiXinLogin weiXinLogin;
    @Test
    public void test1(){
        databaseProvider.ExcuteSql("sql");
        apiProvider.GetDataFromAPI("zrj123456.com","asdasd");
        qQlogin.Login("qq_login");
        weiXinLogin.Login("weixin_login");
    }

}
