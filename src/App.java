import Business.Abstract.UserService;
import Business.concredes.UserManager;
import Entities.concredes.User;

public class App {
    public static void main(String[] args) throws Exception {
        
         User  user = new User("arif", "karak", "123313", "karakullukcu");
        
        
        UserService userService = new UserManager();

        userService.add(user);

        
    
    
    
    }


}



