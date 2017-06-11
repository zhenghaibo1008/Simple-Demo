package io.servicecomb.demo.jaxrs.server;

import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

/**
 * Created by zhenghaibo on 2017/6/11.
 */
public class JaxrsServer {
    public static void main(String[] args) throws Exception {
        Log4jUtils.init();
        BeanUtils.init();
    }
}
