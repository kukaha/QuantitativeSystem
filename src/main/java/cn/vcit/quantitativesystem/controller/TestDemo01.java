package cn.vcit.quantitativesystem.controller;


import cn.vcit.quantitativesystem.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestDemo01 {


    @Autowired
    private TestDemoService testDemoService;

    @RequestMapping("index")
    public String Teindex() throws Exception {
        System.out.println("我的测试代码");
        testDemoService.test();
        int arrays[] = new int[10];
        System.out.println(arrays[11]);
        return "index";
    }
}
