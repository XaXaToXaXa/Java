package OOP.HW5.views;


import OOP.HW5.controllers.UserController;
import OOP.HW5.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;
    private ValidateData validate = new ValidateData();

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("\t \tWelcome to phonebook\n" +
                        "To add new contact print:\t Create\n" +
                        "To read contact print:\t \t Read\n" +
                        "To show all contacts print:\t List\n" +
                        "To change contact print:\t Update\n" +
                        "To delete contact print:\t Delete\n" +
                        "To exit print:\t \t \t \t Exit\n" +
                        "Make your choice: ");
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createUser();
                        break;
                    case READ:
                        readUser();
                        break;
                    case LIST:
                        printAllUsers();
                        break;
                    case UPDATE:
                        updateUser();
                        break;
                    case DELETE:
                        deleteUser();

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void deleteUser() throws Exception {
        String userId = readUser();
        userController.deleteUser(userId);
    }

    private void createUser() {
        userController.saveUser(inputUser());
    }

    private User inputUser() {
        String firstName;
        String lastName;
        String phone;
        do {
            firstName = prompt("Name: ");
        } while (validate.checkFirstName(firstName));
        do {
            lastName = prompt("Last name: ");
        } while (validate.checkLastName(lastName));
        do {
            phone = prompt("Phone number {+7(111)111-11-11}: ");
        } while (validate.checkPhoneNumber(phone));
        return new User(firstName, lastName, phone);
    }

    private String readUser() {
        String id = prompt("User id: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    private void updateUser() {
        String id = readUser();
        User updatedUser = inputUser();
        updatedUser.setId(id);
        userController.updateUser(updatedUser);
    }

    private void printAllUsers() {
        List<User> users = userController.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
