
package pi.bestdeal.models;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Address;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeBodyPart;

/**
 *
 * @author hp
 */
public class Mail {
    
    public void sendEmail(String mailTo,String mailCC,String subject, String content)
    {
        Properties props= System.getProperties();
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        
        props.put ("mail.smtp.auth","true");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.quitwait", "false");
        
        try{
        Session session= Session.getInstance(props,new Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                
                return  new PasswordAuthentication("best.deal.3a19@gmail.com", "123456789best");
            }
        });
        Message message = new MimeMessage(session);
        Address fromAdd= new InternetAddress("best.deal.3a191@gmail.com");
        Address toAdd= new InternetAddress(mailTo);
        Address ccAdd= new InternetAddress(mailCC);
        
        message.setFrom(fromAdd);
        message.setRecipient(Message.RecipientType.TO, toAdd);
        message.setRecipient(Message.RecipientType.CC, ccAdd);
        message.setSubject(subject);
        
        MimeBodyPart messagePart= new MimeBodyPart();
        MimeMultipart multiPart = new MimeMultipart();
        
        multiPart.addBodyPart(messagePart);
        messagePart.setText(content, "utf-8");
        messagePart.setHeader("content-Type","text/html;charset=\"utf-8\"");
        messagePart.setHeader("Content-Transfer-Encoding", "quoted-printable");
        message.setContent(multiPart);
        message.setSentDate(new Date());
        Transport.send(message);
        }catch (Exception e)
        {e.printStackTrace();}
        
        
            
                
            
                
    }
        
    }
    

