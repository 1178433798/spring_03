package zrj.shiyan8.file;

import zrj.shiyan8.Component;

public class TextFile extends Component {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void AntiVirus() {
        System.out.println(name+"杀毒");
    }

    @Override
    public Component add(Component component) {
       try {
           throw new RuntimeException("不能往文件中添加文件或者文件夹");
       }catch (RuntimeException e){
           e.printStackTrace();
       }
       return null;
    }
}
