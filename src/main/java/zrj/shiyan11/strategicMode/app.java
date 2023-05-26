package zrj.shiyan11.strategicMode;

import zrj.shiyan11.strategicMode.strategy.Strategy1;
import zrj.shiyan11.strategicMode.strategy.Strategy2;

public class app {
    public static void main(String[] args) {
        Context context=new Context();
        context.setStrategy(new Strategy1());
        context.useStrategy();

        System.out.println("------------");
        context.setStrategy(new Strategy2());
        context.useStrategy();
    }
}
