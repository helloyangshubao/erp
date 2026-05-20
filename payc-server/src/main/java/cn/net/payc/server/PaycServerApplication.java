package cn.net.payc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目的启动类
 *
 * @author 平安云厨科技集团
 */
@SuppressWarnings("SpringComponentScan") // 忽略 IDEA 无法识别 ${payc.info.base-package}
@SpringBootApplication(scanBasePackages = {"${payc.info.base-package}.server", "${payc.info.base-package}.module"})
public class PaycServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaycServerApplication.class, args);
    }

}
