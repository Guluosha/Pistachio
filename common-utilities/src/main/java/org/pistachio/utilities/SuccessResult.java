package org.pistachio.utilities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright (c) 2007博睿宏远科技发展有限公司,Inc.All Rights Reserved.
 * <br/><b/>
 *
 * @author lipeiheng 2020/3/18 ~ 下午 11:14
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SuccessResult<T> {

    private T data;
}
