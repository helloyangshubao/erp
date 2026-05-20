package cn.net.payc.module.infra.framework.file.config;

import cn.net.payc.module.infra.framework.file.core.client.FileClientFactory;
import cn.net.payc.module.infra.framework.file.core.client.FileClientFactoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 文件配置类
 *
 * @author 平安云厨科技集团
 */
@Configuration(proxyBeanMethods = false)
public class YudaoFileAutoConfiguration {

    @Bean
    public FileClientFactory fileClientFactory() {
        return new FileClientFactoryImpl();
    }

}
