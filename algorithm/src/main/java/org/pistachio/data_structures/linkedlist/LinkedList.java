package org.pistachio.data_structures.linkedlist;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 * 双向链表
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/6/2 ~ 下午 11:35
 */

public class LinkedList {

    /**
     * 追加一个元素到头部
     */
    private void appendHead() {

    }

    /**
     * 追加一个元素到尾部
     */
    private void appendTail() {

    }

    /**
     * 追加一个元素到任意位置
     */
    private void appendNormal() {

    }

    private static class Node<E> {
        E element;
        Node<E> previous;
        Node<E> next;

        public Node(E element, Node<E> previous, Node<E> next) {
            this.element = element;
            this.previous = previous;
            this.next = next;
        }
    }
}
