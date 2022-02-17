package data;

public class Constant {

    public static class Url {
        public static final String JENKINS = "http://192.168.2.50:8080";
        public static final String RELEASE_JENKINS = JENKINS + "/job/Release_5.21";
        public static final String MASTER_JENKINS = JENKINS + "/job/Trunk_Release_Candidate";
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
        public static final String RELEASE_GITLAB = "Release_5.21";
    }
}
