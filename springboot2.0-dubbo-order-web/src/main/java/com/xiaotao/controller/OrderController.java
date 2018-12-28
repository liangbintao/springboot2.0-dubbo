package com.xiaotao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaotao.api.member.IMemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO 订单表现层
 * @Auther lbt
 * @Date 2018/12/28/028 16:39
 * @Version 1.0
 */
@RestController
public class OrderController {

    @Reference
    private IMemberService memberService;

    @GetMapping("/orderToMember")
    public String orderToMember() {

        String user = memberService.getUser();

        System.out.println(user);

        return user;
    }
}
