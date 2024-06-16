package com.wms.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Data
public class QueryPageParam {
    //默认
    private int PAGE_SIZE = 20;
    private int PAGE_NUM = 1;

    @Setter
    @Getter
    private int pageSize = PAGE_SIZE;
    @Setter
    @Getter
    private int pageNum = PAGE_NUM;
    @Getter
    @Setter
    private HashMap param ;

}
