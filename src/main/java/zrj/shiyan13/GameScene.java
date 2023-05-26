package zrj.shiyan13;

public class GameScene {
    private String scene;

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getScene() {
        return scene;
    }

    public SceneMemento saveScene() {
        return new SceneMemento(scene);
    }

    public void restoreScene(SceneMemento memento) {
        scene = memento.getScene();
    }
}

