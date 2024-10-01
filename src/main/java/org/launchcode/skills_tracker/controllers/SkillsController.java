package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String index(){
        return "<html>" +
                    "<head></head>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>C++</li>" +
                            "<li>Go</li>" +
                        "</ol>" +
                    "</body" +
                "</html>";
    }

    @GetMapping("form")
    public String skillForm(){
        String html =
                "<html>" +
                    "<head>" +
                        "<style>" +
                            "body{width:70vw;margin:auto;}" +
                            "form{display:flex;flex-wrap:wrap;}" +
                            "div{width:100%;margin:1rem 0;}" +
                            "select{width:100%;}" +
                            "label{width:100%;margin-top:0.5rem;}" +
                        "</style>" +
                    "</head>" +
                    "<body>" +
                        "<form method = 'post' action = '/result'>" +
                            "<label for='name'>Name:</label>" +
                            "<input id='name' type = 'text' name = 'name' />" +
                            "<div>" +
                                "<label for='first'>My favorite language:</label>" +
                                "<select id='first' name = 'first'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='C++'>C++</option>" +
                                    "<option value='Go'>Go</option>" +
                                "</select>" +
                                "<label for='second'>My second favorite language:</label>" +
                                "<select name = 'second'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='C++'>C++</option>" +
                                    "<option value='Go'>Go</option>" +
                                "</select>" +
                                "<label for='third'>My third favorite language:</label>" +
                                "<select name = 'third'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='C++'>C++</option>" +
                                    "<option value='Go'>Go</option>" +
                                "</select>" +
                            "</div>" +
                            "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                    "</body>" +
                "</html>";
        return html;
    }

    @PostMapping("result")
    public String skillFormPost(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third){
        String html =
            "<html>" +
                "<head>" +
                    "<style>" +
                        "h1{margin-bottom:0.5rem}" +
                        "body{width:70vw;margin:auto;}" +
                        "td{border:1px solid black;}" +
                        "table{border-collapse:collapse;}" +
                    "</style>" +
                "</head>" +
                "<body>" +
                    "<h1>"+name+"</h1>" +
                    "<table>" +
                        "<thead>" +
                            "<tr>" +
                                "<td>Favorite languages</td>" +
                            "</tr>" +
                        "</thead>" +
                        "<tbody>" +
                            "<tr><td>"+first+"</td></tr>" +
                            "<tr><td>"+second+"</td></tr>" +
                            "<tr><td>"+third+"</td></tr>" +
                        "</tbody>" +
                    "</table>" +
                "</body" +
            "</html>";
        return html;
    }

}
