package http;

import com.example.dubbo.framework.invocation;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class httpClient  {


    public void send(String hostname, Integer port, invocation invocation) throws IOException {
         URL url=new URL("http",hostname,port,"/");
         HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
         httpURLConnection.setDoOutput(true);
         OutputStream outputStream=httpURLConnection.getOutputStream();
         ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
         objectOutputStream.writeObject(invocation);
         objectOutputStream.flush();
         objectOutputStream.close();


     }
}
