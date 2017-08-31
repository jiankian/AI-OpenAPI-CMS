package cn.anline.www;

import act.Act;
import act.app.conf.AppConfigurator;

public class AiOpenApi extends AppConfigurator<AiOpenApi>{

    @Override
    public void configure() {

    }

    public static void main(String[] args) throws Exception {
        Act.start();
        System.out.println("程序已启动成功！");
    }
}
