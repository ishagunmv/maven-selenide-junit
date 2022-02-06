package tests.build;
import com.codeborne.selenide.Condition;
import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tests.base.BaseTest;

import static data.Constant.Url.JENKINS;


@Feature("Jenkins autostart build")
@Story("build firmware device")
//@Execution(ExecutionMode.CONCURRENT) // Запуск тестов в нескольких потоках
@ExtendWith(Listener.class)

public class JenkinsTest extends BaseTest {


    @BeforeEach
    void loginJenkinsTest(){
        basePage.goToUrl(JENKINS);
        jenkinsPage.logInJenkins();
    }

    @Test
    void release521Test(){
        jenkinsPage.release521.shouldBe(Condition.visible).click();
        jenkinsPage.startBuild();
    }

    @Test
    void trunkReleaseCandidateTest(){
        jenkinsPage.trunkReleaseCandidate.shouldBe(Condition.visible).click();
        jenkinsPage.startBuild();
    }
}
