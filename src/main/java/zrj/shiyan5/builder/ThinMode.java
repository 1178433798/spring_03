package zrj.shiyan5.builder;

import zrj.shiyan5.builder.Abstract.PlayerBuilder;

public class ThinMode extends PlayerBuilder {
    @Override
    public void buildMenu() {

    }

    @Override
    public void buildPlayList() {

    }

    @Override
    public void buildMainWindow() {
        System.out.println("mainWindow");
        super.playerUI.setMainWindow("mainWindow");
    }

    @Override
    public void buildControlBar() {
        System.out.println("ControlBar");
        super.playerUI.setControlBar("ControlBar");
    }

    @Override
    public void buildFavoriteList() {

    }
}
