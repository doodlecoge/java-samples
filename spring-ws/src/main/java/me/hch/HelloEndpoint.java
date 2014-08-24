package me.hch;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by hch on 2014/5/9.
 */

@Endpoint
public class HelloEndpoint {
    private static final String NS = "http://service.hch.me";

    @ResponsePayload
    @PayloadRoot(localPart = "HelloRequest", namespace = NS)
    public Element handleHelloRequest(@RequestPayload Element req) {
        return req;
    }



}
