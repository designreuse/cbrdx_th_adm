package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Constantes;
import com.microtripit.mandrillapp.lutung.MandrillApi;
import com.microtripit.mandrillapp.lutung.model.MandrillApiError;
import com.microtripit.mandrillapp.lutung.view.MandrillMessage;
import com.microtripit.mandrillapp.lutung.view.MandrillMessageStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UtilitiesController {

    private static String AssembleBody(String Body) {
        return "<html>" +
                "<body bgcolor=\"##B4E3F3\" style=\"font-family: arial, sans-serif; font-size: 100%; line-height: 160%; background-color: #ecf0f1; margin: 0; padding: 0; border: 0;\">" +
                "<table bgcolor=\"#ecf0f1\" style=\"width: 100%; background-color: #ecf0f1; font-size: 14px;\" align=\"center\" cellpadding=\"20\" cellspacing=\"0\" border=\"0\">" +
                "<tr><td><table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 100%; max-width: 700px;\">" +
                "<tr><td align=\"center\"><img style=\"width: 350px; margin-top: -20px;\" src=\"http://www.ciberdix.com/proyecto/gestionamos/img/logo_gestionamos.png\" alt=\"Gestionamos\"></td></tr>" +
                "<tr><td><div style=\"position: relative; padding: 25px;\">" +
                Body +
                "<hr><p style=\"margin-bottom: 10px;\">Cualquier duda comun&iacute;quese con nosotros a nuestra línea de atención: <strong>320 889 9800</strong>" +
                " o escríbanos un correo electrónico a: <strong>servicioalcliente@crezcamos.com</strong>.</p>" +
                "</div><div><a href=\"http://www.ciberdix.com\" style=\"display: block; background-color: #00632e; color: #ffffff; font-weight: bold; padding: 20px; text-decoration: none; text-align: center;-webkit-border-bottom-right-radius: 4px; -webkit-border-bottom-left-radius: 4px; border-bottom-right-radius: 4px; border-bottom-left-radius: 4px;\">" +
                "<span style=\"color: #ffffff;\">2017 &copy; Gestionamos. Un producto de Ciberdix & Crezcamos - Todos los derechos reservados</span>" +
                "</a></div></td></tr></table><table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 100%; text-align: center; font-size: 90%; padding-top: 5px; color: #bdc3c7; max-width: 700px;\">" +
                "<tr><td><p style=\"line-height: initial;\">En cumplimiento con lo establecido en la Ley 1581 de 2012 y en el Decreto 1377 de 2013, <a href=\"http://www.crezcamos.com\" style=\"color: #bdc3c7;\"><span style=\"color: #bdc3c7;\">Crezcamos.com</span></a> tiene el gusto de manifestarle que hemos establecido unas políticas institucionales para el tratamiento de datos personales, siguiendo los lineamientos legales y reglamentarios." +
                "</p></td></tr></table></td></tr></table></body></html>";
    }

    private static List<MandrillMessage.Recipient> AssembleRecipients(String recipients) {
        String[] strings = recipients.split(";");
        ArrayList<MandrillMessage.Recipient> list = new ArrayList<>();
        for (String s : strings) {
            MandrillMessage.Recipient recipient = new MandrillMessage.Recipient();
            recipient.setEmail(s);
            list.add(recipient);
        }
        return list;
    }

    public static void sendMail(String recipients, String subject, String bodyHtml) {
        String systemName = "Gestionamos";
        MandrillApi mandrillApi = new MandrillApi("X-Siym7IlILYF2O2H1w_TQ");
        MandrillMessage message = new MandrillMessage();
        message.setAutoText(true);
        message.setFromEmail("info@ciberdix.com");
        message.setFromName(systemName);
        message.setTo(AssembleRecipients(recipients));
        message.setPreserveRecipients(true);
        message.setSubject(systemName + " - " + subject);
        message.setHtml(AssembleBody(bodyHtml));
        try {
            MandrillMessageStatus[] messageStatusReports = mandrillApi.messages().send(message, false);
        } catch (MandrillApiError | IOException mandrillApiError) {
            mandrillApiError.printStackTrace();
        }
    }

    static String passwordHash(String pass) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10);
        return bCryptPasswordEncoder.encode(pass);
    }

    public Constantes findConstant(String code) {
        try {
            Properties prop = new Properties();
            RestTemplate restTemplate = new RestTemplate();
            InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties");
            prop.load(input);
            String domainUrl = prop.getProperty("url") + ":" + prop.getProperty("domain.port");
            return restTemplate.getForObject(domainUrl + "/api/constantes/codigo/" + code, Constantes.class);
        } catch (IOException e) {
            return null;
        }
    }
}
