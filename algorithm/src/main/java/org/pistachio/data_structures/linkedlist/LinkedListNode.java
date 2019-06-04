package org.pistachio.data_structures.linkedlist;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/2 ~ 上午 12:39
 */

public class LinkedListNode<T> {

    private T value;

    private LinkedListNode<T> nextNode;

    public LinkedListNode() {
    }

    public LinkedListNode(T value, LinkedListNode<T> nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

}
