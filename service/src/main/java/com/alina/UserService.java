package com.alina;

public class UserService {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println("Hello from service");
    }
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
}
