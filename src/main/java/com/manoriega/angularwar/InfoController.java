package com.manoriega.angularwar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("info")
public class InfoController {

    @Value("${version}")
    private String version;

    @GetMapping("version")
    public Info version(){
        return new Info(version);
    }
}
