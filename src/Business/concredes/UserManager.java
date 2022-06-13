package Business.concredes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import Business.Abstract.UserService;
import DataAccess.Abstracts.UserDao;
import DataAccess.concredes.HibernateUserDao;
import Entities.concredes.User;





public class UserManager implements UserService {

    @Override
    public void add(User user) {

        Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
        Matcher m = p.matcher("foobar@gmail.com");

       
        if(user.getPassword().length()<6)
        {
            System.out.println("parola en az 6 karakterden oluşmalıdır");
        }
        else if(user.getFirstName().length()<2 && user.getLastName().length()<2)
        {
            System.out.println("isim ve soyisim en az 2 karakterden oluşmalıdır");
        }
        else if(m.find())
        {
            System.out.println("girdiginiz mail , mail formatında degil");

        }

        else 
        {
            UserDao userDao = new HibernateUserDao();
            userDao.add(user);
        }    

    
    }
    
}
