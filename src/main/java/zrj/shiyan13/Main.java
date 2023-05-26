package zrj.shiyan13;

public class Main {
    public static void main(String[] args) {
        GameScene gameScene = new GameScene();
        gameScene.setScene("第一关");
        System.out.println(gameScene.getScene());
        SceneMemento memento = gameScene.saveScene();
        gameScene.setScene("第二关");
        System.out.println(gameScene.getScene());
        gameScene.restoreScene(memento);
        System.out.println(gameScene.getScene());
    }
}
