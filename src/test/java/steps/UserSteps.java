package steps;

import core.BaseConfig;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import models.createUser.request.CreateUserRequest;
import models.createUser.response.CreateUserResponse;
import models.singleUser.response.SingleUserResponse;

public class UserSteps extends BaseConfig {

    @Step("Получение пользователя")
    public SingleUserResponse getUser() {

        return RestAssured.given()
                .spec(requestSpecification())
                .get("api/users/2")
                .then()
                .spec(responseSpecification(200))
                .extract().as(SingleUserResponse.class);
    }

    @Step("Создание пользователя")
    public CreateUserResponse createUser() {

        return RestAssured.given()
                .spec(requestSpecification())
                .body(CreateUserRequest.builder()
                        .job("Scientist")
                        .name("Einstein")
                        .build())
                .post("api/users")
                .then()
                .spec(responseSpecification(201))
                .extract().as(CreateUserResponse.class);
    }
}
