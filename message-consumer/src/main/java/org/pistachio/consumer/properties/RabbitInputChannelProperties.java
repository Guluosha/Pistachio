package org.pistachio.consumer.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.expression.Expression;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/1/13 ~ 下午 3:57
 */

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "rabbitmq")
public class RabbitInputChannelProperties {

    public static final String JSON_CONVERTER = "jsonConverter";

    /**
     * Exchange name - overridden by exchangeNameExpression, if supplied.
     */
    private String exchangeName = "";

    /**
     * A SpEL expression that evaluates to an exchangeName name.
     */
    private Expression exchangeNameExpression;

    /**
     * Routing key - overridden by routingKeyNameExpression, if supplied.
     */
    private String routingKeyName;

    /**
     * A SpEL expression that evaluates to a routing key.
     */
    private Expression routingKeyNameExpression;

    /**
     * Default delivery mode when 'amqp_deliveryMode' header is not present,
     * true for PERSISTENT.
     */
    private boolean isPersistentDelivery;

    /**
     * Headers that will be mapped.
     */
    private String[] mappedRequestHeaders = {"*"};

    /**
     * The bean name for a custom message converter; if omitted, a SimpleMessageConverter is used.
     * If 'jsonConverter', a Jackson2JsonMessageConverter bean will be created for you.
     */
    private String converterBeanName;
}
