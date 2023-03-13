package org.jspiders.springmvcdemo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {
    List<Store> itemList=new ArrayList<>();
    {
        itemList.add(new Store("TABLE",1500.25,1600.25));
        itemList.add(new Store("AC",15000.25,17000.25));
        itemList.add(new Store("IRON",1000.25,900.25));
    }

    @GetMapping("/")
    public String getMessage(){
        return "welcome";
    }
    @GetMapping("/aboutus")
    public String getStoreInfo(Model model){



        model.addAttribute("records",itemList);

        return "aboutus";
    }
    //this method will show product form
    @GetMapping("/addproduct")
    public String getProductForm(Model model){
        model.addAttribute("store",new Store());
        return "productform";
    }
    //this method will add new object into list
    @PostMapping("/saveproduct")
    public String insertProduct(Store store)
    {
        itemList.add(store);
        return "redirect:/aboutus";
    }
    @GetMapping("/portfolio")
    public String getPortfolio(Model model){
        List<Project> projectList=new ArrayList<Project>();
        projectList.add(new Project(1,"ECOMMERCE","Spring"));
        projectList.add(new Project(2,"Student DB","Hibernate"));
        projectList.add(new Project(3,"Employee DB","JDBC"));
        model.addAttribute("projects",projectList);
        return "portfolio";
    }
}
