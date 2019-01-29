package org.pistachio.consumer.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/1/13 ~ 下午 9:08
 */

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "rabbit.connection")
public class RabbitConnectionProperties {

    /**
     * Default value is localhost
     */
    private String address = "localhost";

    /**
     * Default value is 5672
     */
    private int port = 5672;

    /**
     * Default value is admin
     */
    private String userName = "admin";

    /**
     * Default value is admin
     */
    private String password = "admin";

    /**
     * Default value is localhost
     */
    private String host = "localhost";
}
