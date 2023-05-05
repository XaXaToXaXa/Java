package OOP.HW5;


import OOP.HW5.controllers.UserController;
import OOP.HW5.model.FileOperation;
import OOP.HW5.model.FileOperationImplMd;
import OOP.HW5.model.Repository;
import OOP.HW5.model.RepositoryFile;
import OOP.HW5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/OOP/HW5/users.md");
        System.out.println(pathFile);
//        FileOperation fileOperation = new FileOperationImpl("users.txt");
        FileOperation fileOperation = new FileOperationImplMd(pathFile);
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
