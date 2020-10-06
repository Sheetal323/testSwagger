package io.swagger.api.factories;

import io.swagger.api.StoreApiService;
import io.swagger.api.impl.StoreApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-10-06T11:20:04.761Z[GMT]")public class StoreApiServiceFactory {
    private final static StoreApiService service = new StoreApiServiceImpl();

    public static StoreApiService getStoreApi() {
        return service;
    }
}
