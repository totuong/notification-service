package ttdl.study.notificationservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ttdl.study.notificationservice.module.MessageDTO;
import ttdl.study.notificationservice.service.EmailService;


@RestController
@RequiredArgsConstructor
public class NotificationController {
    private final EmailService emailService;

    @PostMapping("/send-notification")
    public void sendNotification(@RequestBody MessageDTO messageDTO) {
        emailService.sendEmail(messageDTO);
    }
}
