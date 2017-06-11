package io.servicecomb.demo.springmvc.client;

import io.servicecomb.demo.Hello;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;
import io.servicecomb.provider.pojo.RpcReference;
import io.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhenghaibo on 2017/6/11.
 */
@Component
public class SpringClient {

    private static RestTemplate restTemplate;

    @RpcReference(microserviceName = "springmvc", schemaId = "hello")
    private static Hello hello;
    public static void main(String[] args) throws Exception {
        init();

        run();
    }

    public static void init() throws Exception {
        Log4jUtils.init();
        BeanUtils.init();
    }

    private static void run() {
        restTemplate = RestTemplateBuilder.create();
        //hello = BeanUtils.getBean("hello");

        System.out.println("result is " + hello.sayHi("Java Chassis"));
    }
}
