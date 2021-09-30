package edu.vshkvarok.traineeship.weather.fetcher.exceptions;

import lombok.AllArgsConstructor;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
@AllArgsConstructor
public class GlobalExceptionMapper implements ExceptionMapper<Exception> {

    private ExceptionDescription exceptionDescription;

    public Response toResponse(Exception exception) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(exceptionDescription).type(MediaType.APPLICATION_JSON)
                .build();
    }

}
