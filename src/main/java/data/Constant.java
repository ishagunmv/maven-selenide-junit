package data;

import static data.Constant.Url.*;
import static data.Constant.Other.*;

public class Constant {

    public static class Url {
        public static final String JENKINS = "http://192.168.2.50:8080";
        public static final String JENKINS_MASTER = JENKINS + "/job/Trunk_Release_Candidate";
        public static final String JENKINS_RELEASE_5_22 = JENKINS + "/job/Release_5.22";
        public static final String JENKINS_RELEASE_5_21 = JENKINS + "/job/Release_5.21";
        public static final String GITLAB = "http://192.168.2.51";
        public static final String GITLAB_PIPELINE_PAGE = GITLAB + "/software/cordova-mobile-app-builder/-/pipelines/new";
    }

    public static class UsersData {
        public static final String LOGIN_JENKINS = "shagun";
        public static final String LOGIN_GITLAB = "shagun";

        public static final String PASSWORD_JENKINS = "d7g0wp4";
        public static final String PASSWORD_GITLAB = "d7g0wp41";
    }

    public static class Other {
        public static final String GITLAB_RELEASE_5_21 = "Release_5.21";
        public static final String GITLAB_RELEASE_5_22 = "Release_5.22";
        public static final String GITLAB_MASTER = "master";
    }

    /** тут указывать версии сборщиков */
    public static class Builder {
        public static final String ONE_BUILD_JENKINS = JENKINS_RELEASE_5_22;
        public static final String TWO_BUILD_JENKINS = JENKINS_RELEASE_5_21;
        public static final String ONE_BUILD_GITLAB = GITLAB_MASTER;
        public static final String TWO_BUILD_GITLAB = GITLAB_RELEASE_5_21;
    }
}
