package de.neebs;

import io.swagger.client.api.CatalogApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductCatalogFacade {
    @Autowired
    private CatalogApi catalogApi;

    public void testCall() {
        catalogApi.createCatalog(null);
    }
}
