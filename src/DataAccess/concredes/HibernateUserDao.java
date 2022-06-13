package DataAccess.concredes;

import DataAccess.Abstracts.UserDao;
import Entities.concredes.User;

public class HibernateUserDao implements UserDao{

    @Override
    public void add(User user) {
       System.out.println("User added to DB " +user.getFirstName());
        
    }
    
}
