package zrj.shiyan4.factory;

import zrj.shiyan4.abstractclass.Log;
import zrj.shiyan4.entity.FileLog;

public class FileLogFactory extends LogFactory{
    @Override
    public  Log createLog() {
        return new FileLog();
    }
}
