package com.ciberdix.th.controllers;

import com.ciberdix.th.config.XProperties;
import com.ciberdix.th.model.*;
import com.microtripit.mandrillapp.lutung.MandrillApi;
import com.microtripit.mandrillapp.lutung.model.MandrillApiError;
import com.microtripit.mandrillapp.lutung.view.MandrillMessage;
import com.microtripit.mandrillapp.lutung.view.MandrillMessageStatus;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.http.HttpHeaders;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class UtilitiesController {

    private static String version = "VERSION:2.0\r\n";
    private static String prodid = "PRODID:-//Ciberdix/Aseguramos//ES\r\n";
    private static String calBegin = "BEGIN:VCALENDAR\r\n";
    private static String calEnd = "END:VCALENDAR\r\n";
    private static String eventBegin = "BEGIN:VEVENT\r\n";
    private static String eventEnd = "END:VEVENT\r\n";
    private static String tokenHeader = "Authorization";

    static byte[] assembleCalendar(Date programmedDate, String personName) {
        try {
            String uid = "UID:info@ciberdix.com\r\n";
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sd1 = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
            String curTime = sd1.format(new Date(cal.getTimeInMillis()));
            String dtstamp = "DTSTAMP:" + curTime + "\r\n";
            String organizer = "ORGANIZER;CN=Aseguramos:MAILTO:felipe.aguirre@ciberdix.com\r\n";
            String dtstart = "DTSTART:" + sd1.format(programmedDate) + "\r\n";
            String dtend = "DTEND:" + sd1.format(programmedDate.getTime() + 30 * 1000 * 60) + "\r\n";
            String summary = "SUMMARY:Cita\r\n";
            String description = "DESCRIPTION:CREZCAMOS:Cita con " + personName + "\r\n";
            File file = File.createTempFile("temp", ".ics");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(calBegin);
            bw.write(version);
            bw.write(prodid);
            bw.write(eventBegin);
            bw.write(uid);
            bw.write(dtstamp);
            bw.write(organizer);
            bw.write(dtstart);
            bw.write(dtend);
            bw.write(summary);
            bw.write(description);
            bw.write(eventEnd);
            bw.write(calEnd);
            bw.close();
            return Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

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

    public static void sendCalendarMail(String recipients, String subject, String bodyHtml, Date programmedDate, String personName) {
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
        List<MandrillMessage.MessageContent> content = new ArrayList<>();
        MandrillMessage.MessageContent c = new MandrillMessage.MessageContent();
        org.apache.commons.codec.binary.Base64 base64 = new org.apache.commons.codec.binary.Base64();
        try {
            String encoded = base64.encodeAsString(assembleCalendar(programmedDate, personName));
            c.setContent(encoded);
            c.setName("cal.ics");
            c.setType("text/calendar");
            content.add(c);
            message.setAttachments(content);
            MandrillMessageStatus[] messageStatusReports = mandrillApi.messages().send(message, false);
        } catch (MandrillApiError | IOException mandrillApiError) {
            mandrillApiError.printStackTrace();
        }
    }

    static String passwordHash(String pass) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10);
        return bCryptPasswordEncoder.encode(pass);
    }

    static String generateURLToken(String URL) {
        Map<String, Object> map = new HashMap<>();
        map.put("URL", URL);
        return Jwts.builder().setClaims(map).signWith(SignatureAlgorithm.HS512, "fdsldfjklfjsld73647364").compact();
    }

    static Constantes findConstant(String code) {
        RestTemplate restTemplate = new RestTemplate();
        String domainUrl = readParameter("domain.url");
        return restTemplate.getForObject(domainUrl + "/api/constantes/codigo/" + code, Constantes.class);
    }

    static ListasItems findListItem(String tableName, String code) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceURL = readParameter("domain.url") + "/api/" + tableName + "/code/" + code.toUpperCase() + "/";
        return restTemplate.getForObject(serviceURL, ListasItems.class);
    }

    static ListasItems findListItemById(String tableName, Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceURL = readParameter("domain.url") + "/api/" + tableName + "/" + id;
        return restTemplate.getForObject(serviceURL, ListasItems.class);
    }

    static Usuarios findUser(Integer idUsuario) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(readParameter("domain.url") + "/api/usuarios/query/" + idUsuario, Usuarios.class);
    }

    static String readParameter(String parameter) {
        Properties prop = new XProperties();
        try {
            InputStream inputStream = UtilitiesController.class.getClassLoader().getResourceAsStream("application.properties");
            prop.load(inputStream);
            return prop.getProperty(parameter);
        } catch (IOException e) {
            return null;
        }
    }

    static List<VEstructuraOrganizacional> organizationalStructureRecursiveCascade(Integer parentStructureId, List<VEstructuraOrganizacional> structureList) {
        List<VEstructuraOrganizacional> responseList = new ArrayList<>();
        List<VEstructuraOrganizacional> collectedStructures = structureList.stream().filter(u -> u.getIdPadre() != null && u.getIdPadre().equals(parentStructureId)).collect(Collectors.toList());
        if (!collectedStructures.isEmpty()) {
            for (VEstructuraOrganizacional c : collectedStructures) {
                responseList.addAll(organizationalStructureRecursiveCascade(c.getIdEstructuraOrganizacional(), structureList));
            }
        }
        responseList.addAll(collectedStructures);
        return responseList;
    }

    static List<VEstructuraOrganizacional> organizationalStructureCascade(Integer parentStructureId, List<VEstructuraOrganizacional> structureList) {
        List<VEstructuraOrganizacional> responseList = new ArrayList<>();
        List<VEstructuraOrganizacional> collectedStructures = structureList.stream().filter(u -> (u.getIdPadre() != null && u.getIdPadre().equals(parentStructureId)) || u.getIdEstructuraOrganizacional().equals(parentStructureId)).collect(Collectors.toList());
        responseList.addAll(collectedStructures);
        return responseList;
    }

    static List<VCargos> jobRecursiveCascade(Integer parentId, List<VCargos> jobList) {
        List<VCargos> resultList = new ArrayList<>();
        List<VCargos> collectedJobs = jobList.stream().filter(u -> u.getIdCargoJefe() != null && u.getIdCargoJefe().equals(parentId)).collect(Collectors.toList());
        if (!collectedJobs.isEmpty()) {
            for (VCargos c : collectedJobs) {
                resultList.addAll(jobRecursiveCascade(c.getIdCargo(), jobList));
            }
        }
        resultList.addAll(collectedJobs);
        return resultList;
    }

    static List<VCargos> jobCascade(Integer parentId, List<VCargos> jobList) {
        List<VCargos> resultList = new ArrayList<>();
        List<VCargos> collectedJobs = jobList.stream().filter(u -> u.getIdCargoJefe() != null && u.getIdCargoJefe().equals(parentId)).collect(Collectors.toList());
        resultList.addAll(collectedJobs);
        return resultList;
    }

    static HttpHeaders assembleHttpHeaders(String token) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(tokenHeader, token);
        return httpHeaders;
    }

    static String extractToken(HttpServletRequest request) {
        return request.getHeader(tokenHeader);
    }
}
