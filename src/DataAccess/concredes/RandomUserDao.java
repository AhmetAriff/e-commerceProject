package DataAccess.concredes;

import DataAccess.Abstracts.UserDao;
import Entities.concredes.User;

public class RandomUserDao implements UserDao {
// hibernati değiştirisek bile kodu değiştirmiyoruz (open/closed principle)
    @Override
    public void add(User user) {
       System.out.println("random .. ile eklendi");
        
    }
    
}
