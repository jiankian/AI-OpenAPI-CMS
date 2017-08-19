package cn.anline.www;

import act.Act;
import act.app.conf.AppConfigurator;

public class App extends AppConfigurator<App>{

    @Override
    public void configure() {

    }

    public static void main(String[] args) throws Exception {
        Act.start("AI-Open-API");
        System.out.println("程序已启动成功！");
    }
}
