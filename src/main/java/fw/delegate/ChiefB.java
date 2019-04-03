package fw.delegate;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 16:54
 * @Description:
 */
public class ChiefB implements Chief {
    public void cook(String command) {
        System.out.println("我是厨师B,我擅长做中餐,我开始做"+command+"了");
    }
}
