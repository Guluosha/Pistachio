package org.pistachio.utilities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/7/27 ~ 下午 11:34
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultBuilder<T> {

    private Integer code;

    private String message;

    private T data;
}
