package BlueBathGallery.EmailService.Controller;

import BlueBathGallery.EmailService.Modal.Email;
import BlueBathGallery.EmailService.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
@CrossOrigin
public class SendEmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @PostMapping("/enquiry")
    public void sendEnquiryEmail(@RequestBody Email email){
        sendEmailService.sendEnquiryEmail(email);
    }


}
