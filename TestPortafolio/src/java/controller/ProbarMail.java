
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;

//package controller;

/**
 *
 * @author 56942
 */
public class ProbarMail {
 

// Set up the SMTP server.
java.util.Properties props = new java.util.Properties();
//props.put("mail.smtp.host", "smtp.myisp.com");
Session session = Session.getDefaultInstance(props, null);

// Construct the message
String to = "kevinharo16@gmail.com";
String from = "this.mauro@gmail.com";
String subject = "Hello";
Message msg = new MimeMessage(session);
  /*  
    try {
        msg.setFrom(new InternetAddress(from));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        msg.setSubject(subject);
        msg.setText("Hi,\n\nHow are you?");

        // Send the message.
        Transport.send(msg);
        
    } catch (AddressException ex) {
        Logger.getLogger(ProbarMail.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MessagingException ex) {
        Logger.getLogger(ProbarMail.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    } catch (MessagingException e) {
        // Error.
    }
    */
}

