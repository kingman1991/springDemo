package provider;

import com.example.dubbo.framework.Url;
import http.httpServer;
import provider.localregister.localRegister;
import provider.remoteRegister.remoteRegister;

public class provider {
    public static void main(String[] args) {


        localRegister.register(HelloService.class.getName(),HelloServiceImpl.class);
        Url url=new Url("localhost",8080);
        remoteRegister.register(HelloService.class.getName(),url);
        httpServer  httpServer=new httpServer();
        httpServer.start("localhost",8080);

    }
}
