package org.pistachio.utilities.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/31 ~ 下午 6:59
 */

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

}
