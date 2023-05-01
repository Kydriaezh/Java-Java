package HomeWork5_OOP.controller;

import java.util.List;

import HomeWork5_OOP.model.User;
import HomeWork5_OOP.service.UserService;
import HomeWork5_OOP.service.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void saveUser(int numDeposit, String name) {
        userService.saveUser(new User(numDeposit, name));
    }

    public void removeUser(String user) {
        userService.removeUser(user);
    }

    public void updateUser(int index, User user) {
        userService.updateUser(index, user);
    }

    public List<User> getUserList() {
        return userService.getUserList();
    }

    public void inDeposits(String name, Double cash) {
        userService.inDeposits(name, cash);
    }

    public void outDeposits(String name, Double cash) {
        userService.outDeposits(name, cash);
    }

}