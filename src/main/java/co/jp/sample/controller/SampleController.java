package co.jp.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SampleController {

    @RequestMapping(path = "sample", method = RequestMethod.GET)
    public ResponseEntity<?> sample() {
        System.out.println("sample -start");
        ResponseEntity<Object> response = new ResponseEntity<Object>("Hello World !!", HttpStatus.OK);
        System.out.println("sample -end");
        return response;

    }

}
