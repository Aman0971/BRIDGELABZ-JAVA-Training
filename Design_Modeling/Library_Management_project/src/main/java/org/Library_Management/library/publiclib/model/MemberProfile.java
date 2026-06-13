package org.Library_Management.library.publiclib.model;

public class MemberProfile {
    private String name;
    private String email;
    private int age;

    private MemberProfile(Builder builder){
           this.name = builder.name;
           this.email = builder.email;
           this.age  = builder.age;
    }

    public static class Builder{
        private String name;
        private String email;
        private int age;

        public Builder setName(String name){
            this.name =  name;
            return this;
        }
        public Builder SetEmail(String emial){
            this.email = email;
            return this;
        }
        public Builder setAge(int age){
            this.age = age;
            return this;
        }
        public MemberProfile build(){
            return new MemberProfile(this);
        }
    }

}
