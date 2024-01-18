package BlueBathGallery.EmailService.service.Impl;

import BlueBathGallery.EmailService.Modal.Email;
import BlueBathGallery.EmailService.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailServiceImpl implements SendEmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendEnquiryEmail(Email email) {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setFrom(email.getSenderEmail());
        simpleMailMessage.setTo(email.getReceiverEmail());
        simpleMailMessage.setSubject(email.getSubject());
        simpleMailMessage.setText(email.getMessageBody());

        javaMailSender.send(simpleMailMessage);

    }
}
