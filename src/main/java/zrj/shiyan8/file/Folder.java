package zrj.shiyan8.file;

import zrj.shiyan8.Component;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private List<Component> list;
    private String FolderName;
    public Folder(String FolderName) {
        this.list = new ArrayList<>();
        this.FolderName=FolderName;
    }
    @Override
    public void AntiVirus() {
        if (list.size()>0){
            System.out.println(FolderName+"开始杀毒");
            list.forEach(o->o.AntiVirus());
            System.out.println(FolderName+"杀毒完成");
        }else {
            System.out.println("杀毒完成");
        }
    }
    @Override
    public Component add(Component component) {
        this.list.add(component);
        return this;
    }
}
