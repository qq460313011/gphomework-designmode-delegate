package fw.delegate.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 17:08
 * @Description:
 */
public class ServletDispatcher {

    private List<Hander> handerMapping = new ArrayList<Hander>();

    public ServletDispatcher() {
        Class clazz = TestAction.class;
        Hander hander = new Hander();
        try {
            hander.setController(clazz.newInstance());
            hander.setMethod(clazz.getMethod("getTestInfoById", new Class[]{String.class}));
            hander.setUrl("/test/getTestInfoById.json");
            handerMapping.add(hander);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }

    private void doDispatch(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //1.获取用户请求的url
        String uri = request.getRequestURI();
        Hander hander = null;

        //2.根据uri从handlerMapping中找对应的handler
        for (Hander h : handerMapping) {
            if (uri.equals(h.getUrl())) {
                hander = h;
                break;
            }
        }

        Object obj=null;
        try {
            //3.反射执行对应的方法
            obj=hander.getMethod().invoke(hander.getMethod(),request.getParameter("id"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //response.getWriter().write();
    }

}
