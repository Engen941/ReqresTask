package core;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class CustomLogFilter implements Filter {

    @Override
    public Response filter(FilterableRequestSpecification filterableRequestSpecification, FilterableResponseSpecification filterableResponseSpecification, FilterContext filterContext) {
        Response response = filterContext.next(filterableRequestSpecification, filterableResponseSpecification);
        StringBuilder requestBuilder = new StringBuilder();
        requestBuilder.append("\n");
        requestBuilder.append("Headers - ").append(filterableRequestSpecification.getHeaders().toString());
        requestBuilder.append("\n");
        requestBuilder.append("REQUEST:");
        requestBuilder.append("\n");
        requestBuilder.append("Method - ").append(filterableRequestSpecification.getMethod());
        requestBuilder.append("\n");
        requestBuilder.append("Endpoint - ").append(filterableRequestSpecification.getURI());
        requestBuilder.append("\n");
        if (filterableRequestSpecification.getBody() != null){
        requestBuilder.append("Body - ").append(filterableRequestSpecification.getBody().toString());
        requestBuilder.append("\n");
        }
        requestBuilder.append("*****************************************************************");
        log.info(String.valueOf(requestBuilder));  //Log your request where you need it
        StringBuilder responseBuilder = new StringBuilder();
        responseBuilder.append("\n");
        responseBuilder.append("RESPONSE:");
        responseBuilder.append("\n");
        responseBuilder.append("Status code - ").append(response.getStatusCode());
        responseBuilder.append("\n");
        responseBuilder.append("Body - ").append(response.body().asString());
        responseBuilder.append("\n");
        responseBuilder.append("*****************************************************************");
        log.info(String.valueOf(responseBuilder)); //Log your response where you need it
        return response;
    }
}