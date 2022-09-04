package com.example.demo.controller;
import com.example.demo.result.Result;
import com.example.demo.pojo.Text;
import com.example.demo.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.List;

@RestController
public class TextController {
    @Autowired
    TextService textService;

    @CrossOrigin
    @PostMapping("/start")
    @ResponseBody
    public Result saving(@RequestBody Text text){
        textService.add(text);
        return new Result(200);
    }

    @CrossOrigin
    @PostMapping("/mindmap")
    @ResponseBody
    public String update(@RequestBody Text text){
        String username = text.getUsername();
        String time = text.getTime();
        return textService.getByUsernameAndTime(username, time).getMdContent();
    }

    @CrossOrigin
    @PostMapping("/admin/history")
    @ResponseBody
    public List<Text> record(@RequestBody Text text){
        String username = text.getUsername();
        return textService.getByUsername(username);
    }
}
