package com.example.demo.controller;

import com.example.demo.mapper.memberMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;



@Controller
@RequestMapping("/test")
public class TestController {
    @Resource
    private memberMapper memberMapper=null;

    @RequestMapping("/one")
    @ResponseBody
    public Map test(){
        return  memberMapper.findObjectById(1);
    }
}
