package practice.session11.user_service;

public interface UserService {

    User createUser(User user);

    void deleteUser(long id);
}
