package de.neebs;

import io.swagger.client.api.ProductSpecificationApi;
import io.swagger.client.model.SalcusTariffCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductCatalogFacade {
    @Autowired
    private ProductSpecificationApi productSpecificationApi;

    public void testCall() {
        SalcusTariffCreate salcusTariff = new SalcusTariffCreate();
        salcusTariff.setSalcusTariffId("Hello");
        productSpecificationApi.createProductSpecification(salcusTariff);
    }
}
