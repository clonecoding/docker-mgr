package com.jdddata.dockermgr.common.email;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/8/3 17:06
 * @modified By:
 */
@Component
public class JddMailSender {
    @Value("${spring.mail.username}")
    private String from;
    /**
     * 注入MailSender
     */
    @Autowired
    private JavaMailSender mailSender;
    /**
     * 发送邮件的模板引擎
     */
    @Autowired
    private FreeMarkerConfigurer configurer;

    /**
     * @param params
     * @param emailName
     * @param templateName
     * @param toList
     * @author zhangheng(赛事)
     * @description
     */
    public void sendMessageMail(Object params, String emailName, String templateName, String toList) {
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(from);
            /*发送给谁*/
            helper.setTo(InternetAddress.parse(toList));
            /*邮件标题*/
            helper.setSubject("【" + emailName + "】");

            Map<String, Object> model = new HashMap<>();
            model.put("params", params);
            try {
                Template template = configurer.getConfiguration().getTemplate(templateName);
                try {
                    String text = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);

                    helper.setText(text, true);
                    mailSender.send(mimeMessage);
                } catch (TemplateException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
