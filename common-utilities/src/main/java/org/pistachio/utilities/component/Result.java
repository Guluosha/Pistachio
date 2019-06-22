package org.pistachio.utilities.component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/31 ~ 下午 6:59
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    @Getter
    @Setter
    private T data;

}
