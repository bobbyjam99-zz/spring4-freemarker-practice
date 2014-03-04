package spring4.freemarker.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring4.freemarker.model.User;

@Controller
public class UserController {

    private final static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User("Kanako", "Momota"));
        userList.add(new User("Shiori", "Tamai"));
        userList.add(new User("Ayaka", "Sasaki"));
        userList.add(new User("Momoka", "Ariyasu"));
        userList.add(new User("Reni", "Takagi"));
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(@ModelAttribute("model")
    ModelMap model) {

        model.addAttribute("userList", userList);
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("user")
    User user) {

        if (user != null && user.getFirstname() != null && user.getLastname() != null
            && !user.getFirstname().isEmpty() && !user.getLastname().isEmpty()) {

            synchronized (userList) {
                userList.add(user);
            }

        }

        return "redirect:index.do";
    }
}
