package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarDAO carDAO;

    @GetMapping
    public String getAll (@RequestParam(value = "count",required = false) Integer count, Model model) {

        if(count!= null){
            if (count < 5 && count > 0) {
                model.addAttribute("cars", carDAO.getSome(count));
            } else {
                model.addAttribute("cars", carDAO.getAll());
            }
        } else {
            model.addAttribute("cars", carDAO.getAll());
        }
        return "cars/cars";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("car", carDAO.show(id));
        return "cars/show";
    }
}
