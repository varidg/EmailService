package BlueBathGallery.EmailService.Modal;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Email {

    private String senderEmail;

    private String receiverEmail;

    private String subject;

    private String messageBody;

}
