package io.servicecomb.demo.jaxrs.client;

import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;
import io.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhenghaibo on 2017/6/11.
 */
public class JaxrsClient {
    private static RestTemplate templateNew = RestTemplateBuilder.create();

    public static void main(String[] args) throws Exception {
        init();

        run();
    }

    public static void init() throws Exception {
        Log4jUtils.init();
        BeanUtils.init();
    }

    private static void run(){
        String microserviceName = "jaxrs";
        String cseUrlPrefix = "cse://" + microserviceName;
        Map<String, String> params = new HashMap<>();
        params.put("name", "Java Chassis");
        String result = templateNew.postForObject(cseUrlPrefix + "/hello/sayhi", params, String.class);
        System.out.println("result is " + result);
    }
}
