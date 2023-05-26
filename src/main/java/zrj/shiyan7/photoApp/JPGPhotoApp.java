package zrj.shiyan7.photoApp;

public class JPGPhotoApp extends PhotoApp{

    @Override
    public void Revision() {
        System.out.println("JPGPhotoApp");
        filter.doFilter1();
    }
}
