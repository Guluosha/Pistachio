package org.pistachio.utilities.event;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 业务值对象基类
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/5/12 ~ 上午 11:36
 */

public abstract class AbstractBusinessEventSource<T> {

    private T data;

    public T getData() {
        return data;
    }

    public AbstractBusinessEventSource<T> setData(T data) {
        this.data = data;
        return this;
    }
}
