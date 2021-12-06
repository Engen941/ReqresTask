package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import models.createUser.response.CreateUserResponse;
import models.singleUser.response.SingleUserResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.UserSteps;

@Epic("Пользователь")
@Feature("Получение пользователя")
public class UserTest {

    @Test
    @DisplayName("Получение одного пользователя")
    public void singleUser() {
        UserSteps userSteps = new UserSteps();

        SingleUserResponse response = userSteps.getUser();
        Assertions.assertEquals("Janet", response.getData().getFirstName());
    }

    @Test
    @DisplayName("Создание пользователя")
    public void createUser() {
        UserSteps userSteps = new UserSteps();

        CreateUserResponse response = userSteps.createUser();
        Assertions.assertEquals("Einstein", response.getName());
    }
}
