package zrj.shiyan5;

import zrj.shiyan5.builder.FullMode;
import zrj.shiyan5.builder.MemoryMode;
import zrj.shiyan5.builder.ThinMode;
import zrj.shiyan5.director.PlayerDirector;
import zrj.shiyan5.entity.PlayerUI;

public class App1 {
    public static void main(String[] args) {


        PlayerDirector director=new PlayerDirector(new FullMode());
        PlayerUI playerUI1 = director.construct();
        System.out.println("-------------------");
        director.setBuilder(new MemoryMode());
        PlayerUI playerUI2 = director.construct();
        System.out.println("-------------------");
        director.setBuilder(new ThinMode());
        PlayerUI playerUI3 = director.construct();
    }
}
