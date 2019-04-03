package fw.delegate;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 16:54
 * @Description:
 */
public class ChiefA implements Chief {
    public void cook(String command) {
        System.out.println("我是厨师A,我擅长做西餐,我开始做"+command+"了");
    }
}
