package org.pistachio.utilities.wrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * CopyRight (C),深圳市壹账通智能科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle
 * @version 1.0.0
 * @date 2022/03/04 ~ 下午 10:36
 * @since 1.0.0
 */

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    /**
     * 响应码
     */
    private String code;

    /**
     * 描述信息
     */
    private String message;

    /**
     * 数据
     */
    private T data;
}
