package zrj.shiyan5.director;

import zrj.shiyan5.builder.Abstract.PlayerBuilder;
import zrj.shiyan5.entity.PlayerUI;

public class PlayerDirector {
    private PlayerBuilder builder;

    public PlayerUI construct(){
        builder.buildMenu();
        builder.buildMainWindow();
        builder.buildControlBar();
        builder.buildPlayList();
        builder.buildFavoriteList();
        return builder.getResult();
    }

    public void setBuilder(PlayerBuilder builder){
        this.builder = builder;
    }

    public PlayerDirector(PlayerBuilder builder) {
        this.builder = builder;
    }
}
