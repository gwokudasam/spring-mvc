package com.codeworx.controller;

import com.codeworx.entity.User;
import com.codeworx.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by gwokudasam on 10-Dec-16.
 */

@RestController
@RequestMapping("/posts")
public class PostsController {

    private Logger logger = LoggerFactory.getLogger(PostsController.class);

    @Autowired
    private NotificationService notificationService;

    @ResponseStatus (HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET)
    public String getTime(){

        // create user
        User user = new User();
        user.setFirstName("Samuel");
        user.setLastName("Gwokuda");
        user.setEmailAddress("samuelg@getcash.co.zw");

        // send a notification
        try {
            notificationService.sendNotificaitoin(user);
        }catch( Exception e ){
            // catch error
            logger.info("Error Sending Email: " + e.getMessage());
        }
        return "Thank you for registering with us.";
        //return new Date().toString();
    }

}
