package zrj.shiyan7;

import zrj.shiyan7.filter.BlurFilter;
import zrj.shiyan7.photoApp.JPGPhotoApp;

public class app {
    public static void main(String[] args) {
        JPGPhotoApp jpgPhotoApp=new JPGPhotoApp();
        jpgPhotoApp.setFilter(new BlurFilter());
        jpgPhotoApp.Revision();
    }
}
