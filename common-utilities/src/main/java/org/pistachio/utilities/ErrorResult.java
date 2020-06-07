package org.pistachio.utilities;

/**
 * Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 * <br/><b/>
 *
 * @author lipeiheng 2020/3/18 ~ 下午 11:30
 */

public class ErrorResult<T> {

    /**
     * 响应码
     */
    private Integer code;

    /**
     * 描述信息
     */
    private String message;

    /**
     * 数据
     */
    private T data;
}
