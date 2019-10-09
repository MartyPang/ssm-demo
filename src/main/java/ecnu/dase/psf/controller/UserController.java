package ecnu.dase.psf.controller;

import ecnu.dase.psf.entity.User;
import ecnu.dase.psf.service.UserService;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * @ClassName: UserController
 * @Description: This class processes requests related to User.
 * @Author: Marty Pang
 * @Date: 2019-10-08 22:09
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    private static final Logger log = Logger.getLogger(UserController.class);

    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) {
        if(userService == null) {
            log.info("null userService!");
        }
        User resultUser = userService.login(user);
        log.info("request: user/login , user: " + user.toString());
        if (resultUser == null) {
            request.setAttribute("user", user);
            request.setAttribute("errorMsg", "请认真核对账号、密码！");
            return "login";
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", resultUser);
            MDC.put("userName", user.getUserName());
            return "redirect:/main.jsp";
        }
    }
}
