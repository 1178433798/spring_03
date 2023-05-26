package zrj.shiyan7.photoApp;

import zrj.shiyan7.filter.Filter;

public abstract class PhotoApp {
    public Filter filter;

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public abstract void Revision();

}
