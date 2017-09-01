package cn.anline.www;

import act.Act;
import act.app.conf.AppConfigurator;

public class Ann extends AppConfigurator<Ann>{

    @Override
    public void configure() {

    }

    public static void main(String[] args) throws Exception {
        Act.start();
        Act.LOGGER.debug("APP","Started...");
    }
}
