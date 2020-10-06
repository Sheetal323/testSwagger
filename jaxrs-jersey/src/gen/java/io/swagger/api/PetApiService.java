package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Pet;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-10-06T11:20:04.761Z[GMT]")public abstract class PetApiService {
    public abstract Response addPet(Pet body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response findPetsByStatus( @NotNull List<String> status,SecurityContext securityContext) throws NotFoundException;
    public abstract Response findPetsByTags( @NotNull List<String> tags,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPetById(Long petId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updatePet(Pet body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updatePetWithForm(Long petId,String name,String status,SecurityContext securityContext) throws NotFoundException;
}
