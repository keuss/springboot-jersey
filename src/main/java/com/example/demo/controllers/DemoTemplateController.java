package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
public class DemoTemplateController {

    private static final String TEMPLATE =
            "<table border=\"1\">" +
                    "<tr><th>id</th><th>creation time</th><th>last accessed time</th><th>user id</th></tr>" +
                    "<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>" +
                    "</table>";

    @GetMapping("/template")
    public String sessionInfo(HttpSession session) {
        String userId = session.getAttribute("USER_ID") != null ? session.getAttribute("USER_ID").toString() : "vide";
        return String.format(TEMPLATE, session.getId(),
                new Date(session.getCreationTime()), new Date(session.getLastAccessedTime()), userId);
    }

}
