package fw.delegate;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 17:01
 * @Description:
 */
public class DelegateTest {

    public static void main(String[] args) {

        ChiefDelegate chiefDelegate=new ChiefDelegate();
        //委派类不真正做事，真正做事的是员工类
        chiefDelegate.cook("中餐");
        chiefDelegate.cook("西餐");

    }
}
