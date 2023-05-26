package zrj.shiyan8;

import zrj.shiyan8.file.Folder;
import zrj.shiyan8.file.PictureFile;
import zrj.shiyan8.file.TextFile;
import zrj.shiyan8.file.VideoFile;

public class app {
    public static void main(String[] args) {
        Component Folder1=new Folder("Folder1");
        Component Folder2= new Folder("Folder2");
        Folder2.add(new TextFile("TextFile2"))
                .add(new PictureFile("PictureFile2"))
                .add(new VideoFile("VideoFile2"));
        Folder1.add(new TextFile("TextFile1"))
                .add(new PictureFile("PictureFile1"))
                .add(new VideoFile("VideoFile1"))
                .add(Folder2);

        Folder1.AntiVirus();




    }
}
