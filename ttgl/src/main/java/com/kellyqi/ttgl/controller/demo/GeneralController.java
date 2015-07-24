package com.kellyqi.ttgl.controller.demo; 
  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller  
@RequestMapping(value="demo")  
public class GeneralController {  
    @RequestMapping(value="index.do")  
    public String index_jsp(Model model){  
        model.addAttribute("liming", "赵琪你好");  
        Log4JTest.main(null);
        return "demo/index";
    }  
    
    @RequestMapping(value="main.do")  
    public String visitMain(String subPage){
    	ModelMap map = new ModelMap();
    	map.addAttribute("subPage",subPage);
    	return "common/main";
    }
}  