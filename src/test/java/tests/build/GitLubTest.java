package tests.build;

import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tests.base.BaseTest;

import static data.Constant.Url.*;


@Feature("Gitlab autostart build")
@Story("build firmware device")
//@Execution(ExecutionMode.CONCURRENT) // Запуск тестов в нескольких потоках
@ExtendWith(Listener.class)

public class GitLubTest extends BaseTest {

    @BeforeEach
    void loginGitLabTest(){
        basePage.goToUrl(GITLAB);
        gitLubPage.loginGitLab();
    }

    @Test
    void masterStart() {
        basePage.goToUrl(GITLAB_PIPELINE_PAGE);
        gitLubPage.startPipeline();
    }

    @Test
    void releaseStart() {
        basePage.goToUrl(GITLAB_PIPELINE_PAGE);
        gitLubPage.oneVariableSelect();
        gitLubPage.twoVariableSelect();
        gitLubPage.startPipeline();
    }

   @AfterEach
    void waitforReleaseConflict() throws InterruptedException {
        Thread.sleep(60000);
    }
}
