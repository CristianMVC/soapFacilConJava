/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Envelope" , namespace="http://schemas.xmlsoap.org/soap/envelope/")
class Envelope {


private Body[] aBody;



 @XmlElement(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Body")
    public Body[] getBody() {
        return aBody;
    }

    public void setBody(Body[] body) {
        this.aBody = body;
    }


    
}
