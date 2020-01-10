package http;

import com.example.dubbo.framework.invocation;
import provider.localregister.localRegister;
import sun.nio.ch.IOUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HttpHandeler {
    public void handler(HttpServletRequest req, HttpServletResponse resp) {
        try {
            InputStream inputStream=req.getInputStream();
            ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
            invocation invocation= (invocation) objectInputStream.readObject();
            Class implClass = localRegister.get(invocation.getInterfaceName();
            Method method=implClass.getMethod(invocation.getMethosName(),invocation.getPatamtype());
            String result= (String) method.invoke(implClass.newInstance(),invocation.getParam());
            resp.addDateHeader(result,1000l);
        } catch (IOException | ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
