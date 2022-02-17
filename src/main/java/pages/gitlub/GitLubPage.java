package pages.gitlub;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;
import static data.Constant.Other.*;
import static data.Constant.UsersData.*;

public class GitLubPage extends BasePage {


    public void loginGitLab() {
        loginUsername.shouldBe(Condition.visible).sendKeys(LOGIN_GITLAB);
        loginPassword.shouldBe(Condition.visible).sendKeys(PASSWORD_GITLAB);
        loginButton.shouldBe(Condition.visible).click();
    }


    public void oneVariableSelect() {
        oneVariableKey.shouldBe(Condition.visible).sendKeys("GIT_WEBAPPS_BRANCH");
        oneVariableValue.shouldBe(Condition.visible).sendKeys(RELEASE_GITLAB);
    }

    public void twoVariableSelect() {
        twoVariableKey.shouldBe(Condition.visible).sendKeys("GIT_WEBINTERFACE_BRANCH");
        twoVariableValue.shouldBe(Condition.visible).sendKeys(RELEASE_GITLAB);
    }

    public void startPipeline() {
        runPipelineButton.shouldBe(Condition.visible).click();
        playPipelines.shouldBe(Condition.visible).click();
    }


    public final SelenideElement loginUsername = $x("//input[@id='user_login']");
    public final SelenideElement loginPassword = $x("//input[@id='user_password']");
    public final SelenideElement loginButton = $x("//div[@class='submit-container move-submit-down']/input[@name='commit']");
    public final SelenideElement oneVariableKey = $x("(//input[@name='pipeline[variables_attributes][][key]'])[1]");
    public final SelenideElement oneVariableValue = $x("(//textarea[@rows='1'])[1]");
    public final SelenideElement twoVariableKey = $x("(//input[@name='pipeline[variables_attributes][][key]'])[2]");
    public final SelenideElement twoVariableValue = $x("(//textarea[@rows='1'])[2]");
    public final SelenideElement runPipelineButton = $x("//input[@value='Run Pipeline']");
    public final SelenideElement playPipelines = $x("//button[@title='Play']");

}
