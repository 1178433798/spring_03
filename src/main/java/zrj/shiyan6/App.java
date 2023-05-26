package zrj.shiyan6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zrj.Config.SpringCongfig;

public class App {
    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringCongfig.class);
//        test bean = ctx.getBean(test.class);
//        bean.log();

        int[] arr={1,2,4};

        adaptor adaptor=new adaptor(new BinarySearch(),new QuickSort());
        adaptor.search(arr,1);
        adaptor.Sort(arr);

    }


}
