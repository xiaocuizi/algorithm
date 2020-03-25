package com.gemini.config;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.ProtocolHandler;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;

import java.nio.charset.Charset;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 10:02 25/03/2020
 */
@SpringBootConfiguration
public class WebServerConfiguration {

    @Bean
    public ConfigurableServletWebServerFactory webServerFactory(){
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.setPort(11359);
        // 编码
        factory.setUriEncoding(Charset.forName("utf-8"));
        factory.addConnectorCustomizers(new MyTomcatConnectorCustomizer());
        return factory;
    }


    private class MyTomcatConnectorCustomizer implements TomcatConnectorCustomizer {
        @Override
        public void customize(Connector connector) {
            Http11NioProtocol handler = (Http11NioProtocol)connector.getProtocolHandler();
            // 队列长度
            handler.setAcceptCount(200);
            // 最大连接数
            handler.setMaxConnections(5000);
            // 线程池的最大线程数
            handler.setMaxThreads(2000);
            // 最小线程数
            handler.setMinSpareThreads(100);
            // 超时时间
            handler.setConnectionTimeout(30000);
        }
    }
}
