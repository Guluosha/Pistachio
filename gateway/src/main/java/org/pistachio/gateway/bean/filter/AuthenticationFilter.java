package org.pistachio.gateway.bean.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.pistachio.gateway.constants.CustomRequestHeaderConstants;
import org.pistachio.utilities.enums.ServiceNameEnum;
import org.pistachio.utilities.enums.constants.SeparatorEnums;
import org.pistachio.utilities.exception.BadRequestException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.DEBUG_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 认证过滤器
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/1/5 ~ 下午 8:15
 */

@Slf4j
@Component
public class AuthenticationFilter extends ZuulFilter {

    public static final Integer AUTHENTICATION_FILTER_ORDER = DEBUG_FILTER_ORDER + 1;

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
        return PRE_TYPE;
    }

    /**
     * filterOrder() must also be defined for a filter. Filters may have the same  filterOrder if precedence is not
     * important for a filter. filterOrders do not need to be sequential.
     *
     * @return the int order of a filter
     */
    @Override
    public int filterOrder() {
        return AUTHENTICATION_FILTER_ORDER;
    }

    /**
     * a "true" return from this method means that the run() method should be invoked
     *
     * @return true if the run() method should be invoked. false will not invoke the run() method
     */
    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        String requestUri = currentContext.getRequest().getRequestURI();
        String[] urlFieldArray = requestUri.split(SeparatorEnums.URL_SEPARATOR.getString());
        for (String urlField : urlFieldArray) {
            if (urlField.equalsIgnoreCase(ServiceNameEnum.SEARCH.getServiceName())) {
                log.info("接收到访问search服务的请求");
                return false;
            }
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
        HttpServletRequest currentContextRequest = RequestContext.getCurrentContext().getRequest();
        String userToken = currentContextRequest.getHeader(CustomRequestHeaderConstants.USER_TOKEN);
        String macAddress = currentContextRequest.getHeader(CustomRequestHeaderConstants.MAC_ADDRESS);
        String internationalMobileEquipmentIdentity = currentContextRequest.getHeader(CustomRequestHeaderConstants.DEVICE_ID);
        if (userToken == null || macAddress == null || internationalMobileEquipmentIdentity == null) {
            throw new BadRequestException("", 0, "");
        }
        return null;
    }
}
