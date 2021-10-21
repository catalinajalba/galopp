/*
 * Copyright AB Trav och Galopp (556180-4161)
 */

package com.atg.galopp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextUtils {

    private static ApplicationContext context;

    public static ApplicationContext getApplicationContext() {
        return context;
    }

    @Autowired
    public void setContext(ApplicationContext context) {
        ApplicationContextUtils.context = context;
    }

}
