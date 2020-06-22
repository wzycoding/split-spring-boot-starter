package com.imooc.springboot.service.impl;

import com.imooc.springboot.service.ISplitService;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 描述：Split Service 实现
 *
 * @Author wzy
 * @Date 2020/6/22 9:48
 * @Version V1.0
 **/
public class SplitServiceImpl implements ISplitService {


    @SuppressWarnings("all")
    @Override
    public List<String> split(String value) {
        return Stream.of(StringUtils.split(value, ","))
                .collect(Collectors.toList());
    }
}
