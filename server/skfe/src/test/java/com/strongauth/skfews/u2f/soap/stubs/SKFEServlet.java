/**
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License, as published by the Free Software Foundation and
 * available at http://www.fsf.org/licensing/licenses/lgpl.html,
 * version 2.1 or above.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2001-2018 StrongAuth, Inc.
 *
 * $Date$
 * $Revision$
 * $Author$
 * $URL$
 *
 * *********************************************
 *                    888
 *                    888
 *                    888
 *  88888b.   .d88b.  888888  .d88b.  .d8888b
 *  888 "88b d88""88b 888    d8P  Y8b 88K
 *  888  888 888  888 888    88888888 "Y8888b.
 *  888  888 Y88..88P Y88b.  Y8b.          X88
 *  888  888  "Y88P"   "Y888  "Y8888   88888P'
 *
 * *********************************************
 * 
 */

package com.strongauth.skfews.u2f.soap.stubs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SKFEServlet", targetNamespace = "http://soap.u2f.skfews.strongauth.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SKFEServlet {


    /**
     * 
     * @param payload
     * @param did
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authenticate", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.Authenticate")
    @ResponseWrapper(localName = "authenticateResponse", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.AuthenticateResponse")
    @Action(input = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/authenticateRequest", output = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/authenticateResponse")
    public String authenticate(
        @WebParam(name = "did", targetNamespace = "")
        String did,
        @WebParam(name = "payload", targetNamespace = "")
        String payload);

    /**
     * 
     * @param protocol
     * @param payload
     * @param did
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deregister", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.Deregister")
    @ResponseWrapper(localName = "deregisterResponse", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.DeregisterResponse")
    @Action(input = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/deregisterRequest", output = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/deregisterResponse")
    public String deregister(
        @WebParam(name = "did", targetNamespace = "")
        String did,
        @WebParam(name = "protocol", targetNamespace = "")
        String protocol,
        @WebParam(name = "payload", targetNamespace = "")
        String payload);

    /**
     * 
     * @param payload
     * @param did
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authorize", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.Authorize")
    @ResponseWrapper(localName = "authorizeResponse", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.AuthorizeResponse")
    @Action(input = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/authorizeRequest", output = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/authorizeResponse")
    public String authorize(
        @WebParam(name = "did", targetNamespace = "")
        String did,
        @WebParam(name = "payload", targetNamespace = "")
        String payload);

    /**
     * 
     * @param protocol
     * @param payload
     * @param did
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "activate", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.Activate")
    @ResponseWrapper(localName = "activateResponse", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.ActivateResponse")
    @Action(input = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/activateRequest", output = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/activateResponse")
    public String activate(
        @WebParam(name = "did", targetNamespace = "")
        String did,
        @WebParam(name = "protocol", targetNamespace = "")
        String protocol,
        @WebParam(name = "payload", targetNamespace = "")
        String payload);

    /**
     * 
     * @param protocol
     * @param payload
     * @param did
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "preregister", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.Preregister")
    @ResponseWrapper(localName = "preregisterResponse", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.PreregisterResponse")
    @Action(input = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/preregisterRequest", output = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/preregisterResponse")
    public String preregister(
        @WebParam(name = "did", targetNamespace = "")
        String did,
        @WebParam(name = "protocol", targetNamespace = "")
        String protocol,
        @WebParam(name = "payload", targetNamespace = "")
        String payload);

    /**
     * 
     * @param protocol
     * @param payload
     * @param did
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "preauthenticate", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.Preauthenticate")
    @ResponseWrapper(localName = "preauthenticateResponse", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.PreauthenticateResponse")
    @Action(input = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/preauthenticateRequest", output = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/preauthenticateResponse")
    public String preauthenticate(
        @WebParam(name = "did", targetNamespace = "")
        String did,
        @WebParam(name = "protocol", targetNamespace = "")
        String protocol,
        @WebParam(name = "payload", targetNamespace = "")
        String payload);

    /**
     * 
     * @param protocol
     * @param payload
     * @param did
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "preauthorize", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.Preauthorize")
    @ResponseWrapper(localName = "preauthorizeResponse", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.PreauthorizeResponse")
    @Action(input = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/preauthorizeRequest", output = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/preauthorizeResponse")
    public String preauthorize(
        @WebParam(name = "did", targetNamespace = "")
        String did,
        @WebParam(name = "protocol", targetNamespace = "")
        String protocol,
        @WebParam(name = "payload", targetNamespace = "")
        String payload);

    /**
     * 
     * @param protocol
     * @param payload
     * @param did
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getkeysinfo", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.Getkeysinfo")
    @ResponseWrapper(localName = "getkeysinfoResponse", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.GetkeysinfoResponse")
    @Action(input = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/getkeysinfoRequest", output = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/getkeysinfoResponse")
    public String getkeysinfo(
        @WebParam(name = "did", targetNamespace = "")
        String did,
        @WebParam(name = "protocol", targetNamespace = "")
        String protocol,
        @WebParam(name = "payload", targetNamespace = "")
        String payload);

    /**
     * 
     * @param protocol
     * @param did
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getserverinfo", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.Getserverinfo")
    @ResponseWrapper(localName = "getserverinfoResponse", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.GetserverinfoResponse")
    @Action(input = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/getserverinfoRequest", output = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/getserverinfoResponse")
    public String getserverinfo(
        @WebParam(name = "did", targetNamespace = "")
        String did,
        @WebParam(name = "protocol", targetNamespace = "")
        String protocol);

    /**
     * 
     * @param protocol
     * @param payload
     * @param did
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deactivate", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.Deactivate")
    @ResponseWrapper(localName = "deactivateResponse", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.DeactivateResponse")
    @Action(input = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/deactivateRequest", output = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/deactivateResponse")
    public String deactivate(
        @WebParam(name = "did", targetNamespace = "")
        String did,
        @WebParam(name = "protocol", targetNamespace = "")
        String protocol,
        @WebParam(name = "payload", targetNamespace = "")
        String payload);

    /**
     * 
     * @param payload
     * @param did
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://soap.u2f.skfews.strongauth.com/", className = "com.strongauth.skfews.u2f.soap.stubs.RegisterResponse")
    @Action(input = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/registerRequest", output = "http://soap.u2f.skfews.strongauth.com/SKFEServlet/registerResponse")
    public String register(
        @WebParam(name = "did", targetNamespace = "")
        String did,
        @WebParam(name = "payload", targetNamespace = "")
        String payload);

}