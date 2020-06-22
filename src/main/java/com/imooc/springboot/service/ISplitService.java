package com.imooc.springboot.service;

import java.util.List;

/**
 * 描述：字符串分割符接口定义
 *
 * @Author wzy
 * @Date 2020/6/22 9:46
 * @Version V1.0
 **/
public interface ISplitService {

    List<String> split(String value);
}
