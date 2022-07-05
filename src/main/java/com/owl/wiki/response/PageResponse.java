package com.owl.wiki.response;

import java.util.List;

/**
 * @description: 分页响应体封装函数
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/7/5 16:55
 */
public class PageResponse<T> {

    private long total; //数据总条数(不分页的情况下)
    private List<T> list; //当前页的列表数据

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageResponse{" +
                "total=" + total +
                ", list=" + list +
                '}';
    }
}
