package co.ufps.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

    
/**
 * Clase que permite enviar correo electr�nico a trav�s de los servidores de gmail
 * 
 */
public class ServicioEmail {
    
    //Direcci�n del servidor smtp, puede cambiarlo a su servidor de su cuenta particular, en el caso de gmail es smtp.gmail.com
    private final String direccionServidorEmail="smtp.gmail.com";
    //Num�ro del puerto del servidor smtp, en el caso de gmail es el 587
    private final String puertoServidor="587";
    private Properties props = new Properties();
    //Direcci�n del email del usario que env�a el mensaje
    private String emailUsuarioEmisor;
    //Contrase�a del usuario que env�a el correo electr�nico
    private String claveEmailUsuarioEmisor;

    /**
     * 
     * Crea un objeto para enviar correo electr�nico
     * a trav�s de los servidores de gmail
     * @param emailUsuarioEmisor direcci�n email del usuario que env�a el mensaje
     * @param claveEmailUsuarioEmisor contrase�a del usuario que env�a el mensaje
     */
    
    public ServicioEmail(String emailUsuarioEmisor, String claveEmailUsuarioEmisor) {
        this.emailUsuarioEmisor = emailUsuarioEmisor;
        this.claveEmailUsuarioEmisor = claveEmailUsuarioEmisor;
        inicializarPropiedades();
    }

    public ServicioEmail() {
    }
    
    private void inicializarPropiedades()
    {
            props.setProperty("mail.smtp.host", this.direccionServidorEmail);
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", this.puertoServidor);
            props.setProperty("mail.smtp.user", this.emailUsuarioEmisor);
            props.setProperty("mail.smtp.auth", "true");
    }
    
      /**
       * M�todo que permite enviar un correo electr�nico en texto plano
       * @param receptor direcci�n email del usuario a quien se le env�a el mensaje
       * @param asunto asunto del correo electr�nico
       * @param cuerpoMensaje  cuerpo del mensaje del correo electr�nico
       */
    
    public void enviarEmail(String receptor, String asunto, String cuerpoMensaje)
    {
        try
        {
            Session session = Session.getDefaultInstance(props);
            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(this.emailUsuarioEmisor));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(receptor));
            message.setSubject(asunto);
            message.setText(cuerpoMensaje);
            Transport t = session.getTransport("smtp");
            t.connect(this.emailUsuarioEmisor, this.claveEmailUsuarioEmisor);
            t.sendMessage(message, message.getAllRecipients());
            t.close();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

    public String getClaveEmailUsuarioEmisor() {
        return claveEmailUsuarioEmisor;
    }

    public void setClaveEmailUsuarioEmisor(String claveEmailUsuarioEmisor) {
        this.claveEmailUsuarioEmisor = claveEmailUsuarioEmisor;
    }

    public String getEmailUsuarioEmisor() {
        return emailUsuarioEmisor;
    }

    public void setEmailUsuarioEmisor(String emailUsuarioEmisor) {
        this.emailUsuarioEmisor = emailUsuarioEmisor;
    }
    
    
    
    
} 
  