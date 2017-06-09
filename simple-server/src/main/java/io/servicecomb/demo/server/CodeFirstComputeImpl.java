package io.servicecomb.demo.server;

import io.servicecomb.demo.Compute;
import io.servicecomb.provider.pojo.RpcSchema;

/**
 * Created by zhenghaibo on 2017/6/9.
 */
@RpcSchema(schemaId = "codefirstcompute")
public class CodeFirstComputeImpl implements Compute{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int multi(int a, int b) {
        return a * b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int divide(int a, int b) {
        if (b != 0){
            return a / b;
        }
        return 0;
    }
}
