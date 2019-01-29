package org.pistachio.consumer.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.concurrent.TimeUnit;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2018/12/16 ~ 下午 11:11
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "thread-pool")
public class ThreadPoolExecutorProperties {

    /**
     * Default value is the core number of CPUs in the current operating system
     */
    private int corePoolSize = Runtime.getRuntime().availableProcessors();

    /**
     * Default value is the two times of corePoolSize
     */
    private int maximumPoolSize = corePoolSize * 2;

    /**
     * Default value is 10
     */
    private int timeout = 10;

    /**
     * Default unit is Seconds,Candidate values are in TimeUnit Enum
     */
    private String timeoutUnit = TimeUnit.SECONDS.name();

}
