package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ListasItems;
import com.ciberdix.th.model.RequerimientosAcciones;
import com.microtripit.mandrillapp.lutung.MandrillApi;
import com.microtripit.mandrillapp.lutung.model.MandrillApiError;
import com.microtripit.mandrillapp.lutung.view.MandrillMessage;
import com.microtripit.mandrillapp.lutung.view.MandrillMessageStatus;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.*;

/**
 * Created by Danny on 16/05/2017.
 */

@RestController
@CrossOrigin
@RequestMapping("/api/requerimientosAcciones")
public class RequerimientosAccionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${front.url}")
    private String frontUrl;

    @Value("${business.url}")
    private String businessUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<RequerimientosAcciones> findAll() {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        List<RequerimientosAcciones> requerimientosAcciones = Arrays.asList(restTemplate.getForObject(serviceUrl, RequerimientosAcciones[].class));
        return requerimientosAcciones;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RequerimientosAcciones findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, RequerimientosAcciones.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosAcciones create(@RequestBody RequerimientosAcciones o) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();

        ListasItems listasItems = restTemplate.getForObject(businessUrl + "/api/listas/tabla/ListasRequerimientosAcciones/code/AUT", ListasItems.class);
        if (o.getIdAccion().equals(listasItems.getIdLista())) {
            Map<String, Object> map = new HashMap<>();
            map.put("URL", frontUrl + "/vacancies/approve/" + o.getIdRequerimiento());
            String token = Jwts.builder().setClaims(map).signWith(SignatureAlgorithm.HS512, "fdsldfjklfjsld73647364").compact();
            String body = "Se ha creado un requerimiento de personal que requiere su aprobacion: puede hacer click en el siguiente enlace o copiarlo en su navegador para dar respuesta a la solicitud <a href=\"" + frontUrl + "/login/" + token + "\">" + frontUrl + "/login/" + token + "</a>";
            processMailInfo("felipe.aguirre.santos@gmail.com", "Aprobación", body);
        }
        return restTemplate.postForObject(serviceUrl, o, RequerimientosAcciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosAcciones o) {
        String serviceUrl = baseUrl + "/api/requerimientosAcciones/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }

    public void processMailInfo(String correo, String Subject, String Body) {
        MandrillApi mandrillApi = new MandrillApi("X-Siym7IlILYF2O2H1w_TQ");
        MandrillMessage message = new MandrillMessage();
        message.setSubject(Subject);
        message.setHtml("<html>" +
                "    <body bgcolor=\"##B4E3F3\" style=\"font-family: arial, sans-serif; font-size: 100%; line-height: 160%; background-color: #ecf0f1; margin: 0; padding: 0; border: 0;\">\n" +
                "        <table bgcolor=\"#ecf0f1\" style=\"width: 100%; background-color: #ecf0f1; font-size: 14px;\" align=\"center\" cellpadding=\"20\" cellspacing=\"0\" border=\"0\">\n" +
                "            <tr>\n" +
                "                <td>\n" +
                "                    <table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 100%; max-width: 700px;\">\n" +
                "                        <tr>\n" +
                "                            <td align=\"center\"><img style=\"width: 350px; margin-top: -20px;\" src=\"http://www.ciberdix.com/proyecto/gestionamos/img/logo_gestionamos.png\" alt=\"Gestionamos\"></td>\n" +
                "\n" +
                "                        </tr>\n" +
                "                    </table>\n" +
                "                    <table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" bgcolor=\"#ffffff\" style=\"width: 100%; max-width: 700px; background-color: #ffffff; -webkit-border-radius: 4px; border-radius: 4px;\">\n" +
                "                        <tr>\n" +
                "                            <td>\n" +
                "                                <div style=\"position: relative; padding: 25px;\">\n" + Body +
                "                                    <hr><p style=\"margin-bottom: 10px;\">Cualquier duda comun&iacute;quese con nosotros a nuestra línea de atención: <strong>320 889 9800</strong>\n" +
                "                                      o escríbanos un correo electrónico a: <strong>servicioalcliente@crezcamos.com</strong>.</p>\n" +
                "                                </div>\n" +
                "                                <div>\n" +
                "                                    <a href=\"http://www.ciberdix.com\" style=\"display: block; background-color: #00632e; color: #ffffff; font-weight: bold; padding: 20px; text-decoration: none; text-align: center;-webkit-border-bottom-right-radius: 4px; -webkit-border-bottom-left-radius: 4px; border-bottom-right-radius: 4px; border-bottom-left-radius: 4px;\">\n" +
                "                                        <span style=\"color: #ffffff;\">2017 &copy; Gestionamos. Un producto de Ciberdix & Crezcamos - Todos los derechos reservados</span>\n" +
                "                                    </a>\n" +
                "                                </div>\n" +
                "                            </td>\n" +
                "                        </tr>\n" +
                "                    </table>\n" +
                "                    <table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 100%; text-align: center; font-size: 90%; padding-top: 5px; color: #bdc3c7; max-width: 700px;\">\n" +
                "                        <tr>\n" +
                "                            <td>\n" +
                "                              <p style=\"line-height: initial;\">\n" +
                "                              En cumplimiento con lo establecido en la Ley 1581 de 2012 y en el Decreto 1377 de 2013, <a href=\"http://www.crezcamos.com\" style=\"color: #bdc3c7;\"><span style=\"color: #bdc3c7;\">Crezcamos.com</span></a> tiene el gusto de manifestarle que hemos establecido unas políticas institucionales para el tratamiento de datos personales, siguiendo los lineamientos legales y reglamentarios.\n" +
                "</p></td></tr></table></td></tr></table></body></html>");
        message.setAutoText(true);
        message.setFromEmail("info@ciberdix.com");
        message.setFromName("Gestionamos");
        ArrayList<MandrillMessage.Recipient> recipients = new ArrayList<>();
        MandrillMessage.Recipient recipient = new MandrillMessage.Recipient();
        recipient.setEmail(correo);
        recipient.setName("Gerente");
        recipients.add(recipient);
        message.setTo(recipients);
        message.setPreserveRecipients(true);
        try {
            MandrillMessageStatus[] messageStatusReports = mandrillApi.messages().send(message, false);
        } catch (MandrillApiError mandrillApiError) {
            mandrillApiError.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
