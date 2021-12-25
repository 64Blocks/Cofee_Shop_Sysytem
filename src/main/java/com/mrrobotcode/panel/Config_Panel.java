package com.mrrobotcode.panel;

public class Config_Panel {
    int id ;
    String Post;
    String name;
    String Username;
    String password;

    public Config_Panel(int id, String post, String name, String username, String password) {
        this.id = id;
        Post = post;
        this.name = name;
        Username = username;
        this.password = password;
    }
    //for login
    public Config_Panel(String username, String password) {
        Username = username;
        this.password = password;
    }


}
