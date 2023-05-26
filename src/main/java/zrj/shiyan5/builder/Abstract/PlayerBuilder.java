package zrj.shiyan5.builder.Abstract;

import zrj.shiyan5.entity.PlayerUI;

public abstract class PlayerBuilder {

    protected PlayerUI playerUI=new PlayerUI();

    public abstract void buildMenu();
    public abstract void buildPlayList();
    public abstract void buildMainWindow();
    public abstract void buildControlBar();
    public abstract void buildFavoriteList();

    public PlayerUI getResult()
    {
        return playerUI;
    }



}
