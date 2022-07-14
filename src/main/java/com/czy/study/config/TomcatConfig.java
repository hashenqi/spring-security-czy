//package com.czy.study.config;
//
//import org.apache.catalina.connector.Connector;
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author chenzeyao
// * @Date 2022/7/12 15:40
// * @Description
// */
//@Configuration
//public class TomcatConfig {
//
//    @Bean
//    public TomcatServletWebServerFactory tomcatServletWebServerFactory() {
//        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
//        factory.addAdditionalTomcatConnectors(createTomcatConnector());
//        return factory;
//    }
//
//    /**
//     * 创建一个Tomcat服务，http协议+8080端口
//     * @return
//     */
//    private Connector createTomcatConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        connector.setPort(8080);
//        return connector;
//    }
//
//}
