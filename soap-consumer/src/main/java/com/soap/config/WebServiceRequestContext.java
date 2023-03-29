package com.soap.config;

import org.apache.http.cookie.Cookie;

import java.util.ArrayList;
import java.util.List;

public class WebServiceRequestContext {

    private static ThreadLocal<List<Cookie>> attributes = ThreadLocal.withInitial(() -> new ArrayList<Cookie>());

    static {
        attributes.set(new ArrayList<>());
    }
    public static void initialize() {
        attributes.set(new ArrayList<>());
    }
    public static void cleanup() {
        attributes.set(new ArrayList<>());
        attributes.remove();
    }
    public static List<Cookie> getAllAttributes() {
        return attributes.get();
    }
    public static void setAttribute(Cookie cookie) {
        if(null == attributes.get()) {
            attributes.set(new ArrayList<>());
        }
        attributes.get().add(cookie);
    }


}
