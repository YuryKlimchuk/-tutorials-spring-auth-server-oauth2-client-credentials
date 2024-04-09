package com.hydroyura.tutorials.springauthserver.authserver.config;

import com.hydroyura.tutorials.springauthserver.sharedlibs.AbstractLogFilter;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class AuthServerLogFilter extends AbstractLogFilter {
    @Override
    protected void initLogger() {
        this.LOG = LoggerFactory.getLogger("AUTH_SERVER_APP");
    }
}