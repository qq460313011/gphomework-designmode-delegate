package fw.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 16:55
 * @Description:
 */
public class ChiefDelegate implements Chief {

    private Map<String, Chief> map = new HashMap<String, Chief>();

    public ChiefDelegate() {
        map.put("西餐", new ChiefA());
        map.put("中餐", new ChiefB());
    }


    public void cook(String command) {
        map.get(command).cook(command);
    }
}
