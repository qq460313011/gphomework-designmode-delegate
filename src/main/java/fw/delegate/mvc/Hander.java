package fw.delegate.mvc;

import java.lang.reflect.Method;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 17:05
 * @Description:
 */
public class Hander {

    //controller
    private Object controller;

    public Object getController() {
        return controller;
    }

    public void setController(Object controller) {
        this.controller = controller;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    //controller对象的方法
    private String url;
    //url对应的方法
    private Method method;



}
