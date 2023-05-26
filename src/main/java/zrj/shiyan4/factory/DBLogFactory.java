package zrj.shiyan4.factory;

import zrj.shiyan4.abstractclass.Log;
import zrj.shiyan4.entity.DbLog;

public class DBLogFactory extends LogFactory{
    @Override
    public Log createLog() {
        return new DbLog();
    }
}
