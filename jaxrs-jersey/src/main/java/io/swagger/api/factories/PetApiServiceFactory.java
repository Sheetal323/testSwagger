package io.swagger.api.factories;

import io.swagger.api.PetApiService;
import io.swagger.api.impl.PetApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-10-06T11:20:04.761Z[GMT]")public class PetApiServiceFactory {
    private final static PetApiService service = new PetApiServiceImpl();

    public static PetApiService getPetApi() {
        return service;
    }
}
