package com.hydroyura.tutorials.springauthserver.catalog;

import com.hydroyura.tutorials.springauthserver.sharedlibs.AbstractLogFilter;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CatalogLogFilter extends AbstractLogFilter {
    @Override
    protected void initLogger() {
        this.LOG = LoggerFactory.getLogger("CATALOG_APP");
    }
}
