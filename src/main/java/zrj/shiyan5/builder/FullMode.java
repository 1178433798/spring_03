package zrj.shiyan5.builder;

import zrj.shiyan5.builder.Abstract.PlayerBuilder;

public class FullMode extends PlayerBuilder {
    @Override
    public void buildMenu() {
        super.playerUI.setMenu("menu");
    }

    @Override
    public void buildPlayList() {
        System.out.println("playList");
        super.playerUI.setPlayList("playList");
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
        System.out.println("FavoriteList");
        super.playerUI.setControlBar("FavoriteList");
    }
}
