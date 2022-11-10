/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Response;

/**
 *
 * @author Usuario
 */
public class Mavenproject4 {
    
    
    public static void main(String[] args) throws SOAPException, IOException {
        try {
            File file = new File("newfile.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Envelope.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            jaxbUnmarshaller.setEventHandler(
                new ValidationEventHandler() {
                    public boolean handleEvent(ValidationEvent event ) {
                        throw new RuntimeException(event.getMessage(),
                            event.getLinkedException());
                    }
                }
            );
            
            
            
            
           

            Envelope response = (Envelope) jaxbUnmarshaller.unmarshal(file);

          
           System.out.print(response.getBody()[0].getC21ASConsSociosPorEjecResponse()[0]
                   .getStatus()[0].getSuccessIndicator());
          

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}