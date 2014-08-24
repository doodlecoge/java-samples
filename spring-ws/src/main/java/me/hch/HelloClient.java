package me.hch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.xml.transform.ResourceSource;
import org.springframework.xml.transform.StringResult;

import javax.xml.transform.Source;

/**
 * Created by hch on 2014/5/9.
 */
public class HelloClient extends WebServiceGatewaySupport {
    private Resource request;

    public void setRequest(Resource request) {
        this.request = request;
    }

    public void foo() throws Exception {
        Source requestSource = new ResourceSource(request);
        StringResult result = new StringResult();
        getWebServiceTemplate().sendSourceAndReceiveToResult(requestSource, result);
        System.out.println();
        System.out.println(result);
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext-client.xml", HelloClient.class);
        HelloClient helloClient = (HelloClient) applicationContext.getBean("helloClient");
        helloClient.foo();
    }
}
