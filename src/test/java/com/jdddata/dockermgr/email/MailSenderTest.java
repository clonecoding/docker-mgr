package com.jdddata.dockermgr.email;

import com.jdddata.dockermgr.common.email.EmailMessage;
import com.jdddata.dockermgr.common.email.JddMailSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/8/3 17:24
 * @modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailSenderTest {

    @Autowired
    JddMailSender mailSender;

    @Test
    public void sendEmail() {
        EmailMessage message = new EmailMessage();

        message.setMessageStatus("Failed");
        message.setProjectName("loghub");

        mailSender.sendMessageMail(message, "测试消息通知", "message.ftl");
    }
}
