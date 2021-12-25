package com.mrrobotcode.panel;


import com.mrrobotcode.db.Employee_information;

public class General_manger extends Run_info {
    private int id ;
    private String post;
    private String name;
    private String username;
    private String password;

    public static void Show_info_employee()
    {
        Employee_information employee_information = new Employee_information();
        employee_information.Show_Employee();
    }
    public static void Config_manger()
    {
        General_manger general_manger = new General_manger();
        general_manger.setId(1);
        general_manger.setPost("General_Manger");
        general_manger.setName("Prudence Richa");
        general_manger.setUsername("Admin");
        general_manger.setPassword("Admin");

        Config_Panel Mangement = new Config_Panel(general_manger.getId(),general_manger.getPost(),general_manger.getName(),general_manger.getUsername(),general_manger.getPassword());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
