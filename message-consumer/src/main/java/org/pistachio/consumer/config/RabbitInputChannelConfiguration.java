package org.pistachio.consumer.config;

import lombok.extern.slf4j.Slf4j;
import org.pistachio.consumer.properties.RabbitConnectionProperties;
import org.pistachio.consumer.properties.RabbitInputChannelProperties;
import org.pistachio.utilities.ApplicationContextHolder;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.amqp.outbound.AmqpOutboundEndpoint;
import org.springframework.messaging.MessageHandler;

import javax.annotation.Resource;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/1/13 ~ 下午 3:57
 */

@Slf4j
@Configuration
public class RabbitInputChannelConfiguration {

    @Resource
    private RabbitInputChannelProperties rabbitInputChannelProperties;

    @Resource
    private RabbitConnectionProperties rabbitConnectionProperties;

    @Bean
    ConnectionFactory buildRabbitmqConnectionFactory() {
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory();
        cachingConnectionFactory.setAddresses(rabbitConnectionProperties.getAddress());
        cachingConnectionFactory.setPort(rabbitConnectionProperties.getPort());
        cachingConnectionFactory.setUsername(rabbitConnectionProperties.getUserName());
        cachingConnectionFactory.setPassword(rabbitConnectionProperties.getPassword());
        cachingConnectionFactory.setHost(rabbitConnectionProperties.getHost());
        cachingConnectionFactory.setApplicationContext(ApplicationContextHolder.getInstance().getApplicationContext());
        return cachingConnectionFactory;
    }

    @Bean
    AmqpTemplate buildRabbitAmqpTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(buildRabbitmqConnectionFactory());
        rabbitTemplate.setExchange(rabbitInputChannelProperties.getExchangeName());
        rabbitTemplate.setRoutingKey(rabbitInputChannelProperties.getRoutingKeyName());
        return rabbitTemplate;
    }

    @Bean
    MessageHandler amqpChannelAdapter() {
        return new AmqpOutboundEndpoint(buildRabbitAmqpTemplate());
    }

}
