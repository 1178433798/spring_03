package zrj.abstractclass.impl;


import org.springframework.stereotype.Component;
import zrj.abstractclass.IDatabaseProvider;

@Component
public class IDatabaseProviderImpl implements IDatabaseProvider {
    @Override
    public void ExcuteSql(String sql) {
        System.out.println(sql);
    }
}
