package org.pistachio.gateway.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * Zuul网关配置
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/1/5 ~ 下午 8:15
 */

@Configuration
public class ZuulConfiguration extends ZuulFilter {

    /**
     * 过滤器要处理的url
     */
//    @Value(value = "${filter.normal.url}")
    private String filterUrl;

//    @Value(value = "${filter.auth.url}")
    private String filterAuthUrl;

    /**
     * 分隔符
     */
    private static final String SEPARATOR = ";";

    /**
     * to classify a filter by type. Standard types in Zuul are "pre" for pre-routing filtering,
     * "route" for routing to an origin, "post" for post-routing filters, "error" for error handling.
     * We also support a "static" type for static responses see  StaticResponseFilter.
     * Any filterType made be created or added and run by calling FilterProcessor.runFilters(type)
     *
     * @return A String representing that type
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * filterOrder() must also be defined for a filter. Filters may have the same  filterOrder if precedence is not
     * important for a filter. filterOrders do not need to be sequential.
     *
     * @return the int order of a filter
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * a "true" return from this method means that the run() method should be invoked
     *
     * @return true if the run() method should be invoked. false will not invoke the run() method
     */
    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest currentHttpServletRequest = currentContext.getRequest();
        String[] splitUrls = filterUrl.split(SEPARATOR);
        for (String splitUrl : splitUrls) {
            if (currentHttpServletRequest.getRequestURL().toString().contains(splitUrl)){
                return false;
            }
        }
        String[] splitAuthUrls = filterAuthUrl.split(SEPARATOR);
        for (String splitAuthUrl : splitAuthUrls) {
            return !currentHttpServletRequest.getRequestURL().toString().contains(splitAuthUrl);
        }
        return true;
    }

    /**
     * if shouldFilter() is true, this method will be invoked. this method is the core method of a ZuulFilter
     *
     * @return Some arbitrary artifact may be returned. Current implementation ignores it.
     * @throws ZuulException if an error occurs during execution.
     */
    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
