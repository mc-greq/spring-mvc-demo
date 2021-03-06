package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloWorld";
    }

    // new controller method to read form data and
    // add data to the model
    // working with HttpServletRequest

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        // read the request parameter from the html form
        String theName = request.getParameter("studentName");

        // convert data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo!" + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloWorld";
    }

    // same functionality as above but using @RequestParam
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(
            @RequestParam("studentName") String theName, Model model){

        theName = theName.toUpperCase();

        String result = "Hey there, using RequestParam! " + theName;

        model.addAttribute("message", result);

        return "helloWorld";
    }

}
