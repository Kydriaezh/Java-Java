package HomeWork5_OOP.service;

import java.util.List;

import HomeWork5_OOP.model.User;

public interface UserService {
    void saveUser(User user);

    void removeUser(String user);

    void updateUser(int index, User user);

    void inDeposits(String name, Double cash);
    void outDeposits(String name, Double cash);

    List<User> getUserList();
}