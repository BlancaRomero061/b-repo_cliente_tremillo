/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.micompania.ws.recu_tremillo_9a;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 *
 *
 */
@WebService(serviceName = "recu_tremillo_web_operaciones_9a")
public class recu_tremillo_web_operaciones_9a {

   @WebMethod(operationName = "calcularMasa")
    public double calcularMasa(
            @WebParam(name = "densidad") double densidad, 
            @WebParam(name = "volumen") double volumen) {
        return densidad * volumen;
    }
}
