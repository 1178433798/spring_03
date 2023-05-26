package zrj.shiyan11.strategicMode;

import zrj.shiyan11.strategicMode.strategy.Strategy;

import java.util.Objects;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void useStrategy(){
        if (Objects.nonNull(strategy)){
            strategy.strategy();
        }else {
            throw new RuntimeException("请指定策略");
        }

    }

}
