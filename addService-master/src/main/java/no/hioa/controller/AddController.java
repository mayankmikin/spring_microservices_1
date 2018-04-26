package no.hioa.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Usman on 08.05.2017.
 */

@RestController
public class AddController {

    @RequestMapping(value = "/{num1}/{num2}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String add(@PathVariable int num1,
                      @PathVariable int num2){

        return Integer.toString( num1 + num2 );
    }
}
