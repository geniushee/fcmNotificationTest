package com.example.fcm.fcm;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/v1")
public class FCMController {
    private final FCMService fcmService;

    public FCMController(FCMService fcmService){
        this.fcmService = fcmService;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/token")
    public String saveToken(@RequestParam(name = "t")String token){
        fcmService.saveToken(token);
        return "success saving token";
    }

    @PostMapping("/send")
    @ResponseBody
    public String sendPush(){
        fcmService.sendMessage("테스트 푸쉬", "정상적으로 작동 중 입니다.");
        return "sent";
    }


}
