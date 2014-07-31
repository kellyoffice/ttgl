package com.kellyqi.ttgl.demo.controller; 
  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
  
@Controller  
public class GeneralController {  
    @RequestMapping(value="index.do")  
    public String index_jsp(Model model){  
        model.addAttribute("liming", "赵琪你好");  
        Log4JTest.main(null);
        return "demo/index";
    }  
}  