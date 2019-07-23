package org.pistachio.gateway.bean.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/7/8 ~ 上午 11:29
 */

@ConfigurationProperties(prefix = "people")
public class CustomerZuulFilterProperty {

    /**
     * The url that need to be authentication, default is null
     */
    private String authFilterUrl;

    /**
     * The url that need to be certification, default is null
     */
    private String certificationUrl;

    public String getAuthFilterUrl() {
        return authFilterUrl;
    }

    public CustomerZuulFilterProperty setAuthFilterUrl(String authFilterUrl) {
        this.authFilterUrl = authFilterUrl;
        return this;
    }

    public String getCertificationUrl() {
        return certificationUrl;
    }

    public CustomerZuulFilterProperty setCertificationUrl(String certificationUrl) {
        this.certificationUrl = certificationUrl;
        return this;
    }
}
