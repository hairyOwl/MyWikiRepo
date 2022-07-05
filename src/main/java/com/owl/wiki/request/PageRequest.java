package com.owl.wiki.request;

/**
 * @description: 分页请求封装函数
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/7/5 16:55
 */
public class PageRequest {

    private int page;
    private int size;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "PageRequest{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
}
