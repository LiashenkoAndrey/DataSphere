public interface UserService {

    public void create(User user);

    public User getById(Long id);

    public User deleteById(Long id);

    public void deductById(Long id);
}
