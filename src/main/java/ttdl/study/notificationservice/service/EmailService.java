package ttdl.study.notificationservice.service;

import ttdl.study.notificationservice.module.MessageDTO;

public interface EmailService {
    void sendEmail(MessageDTO messageDTO);
}



