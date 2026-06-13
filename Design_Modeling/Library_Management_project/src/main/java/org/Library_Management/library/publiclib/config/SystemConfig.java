package org.Library_Management.library.publiclib.config;

public class SystemConfig {
    private static SystemConfig instance;

    private String branchName = "Oakridge Community Library";
    private SystemConfig(){}
    public static  SystemConfig getInstance(){
        if(instance ==  null){
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getBranchName(){
        return branchName;
    }
}
