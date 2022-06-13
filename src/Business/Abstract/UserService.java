package Business.Abstract;


import Entities.concredes.User;

public interface UserService {
    void add(User user);
    void verificationEmail(User user);
    void verificationLink(User user);
}
