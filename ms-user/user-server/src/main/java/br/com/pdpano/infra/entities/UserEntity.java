package br.com.pdpano.infra.entities;

import br.com.pdpano.domain.Credentials;
import br.com.pdpano.domain.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long userId;
    public String name;
    public String username;
    public String password;

    public UserEntity() { }
    public UserEntity(Long userId, String name, String username, String password) {
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public static UserEntity toEntity(User user) {
        return new UserEntity(
                user.id(),
                user.name(),
                user.credentials().username(),
                user.credentials().password()
        );
    }

    public static User toDomain(UserEntity user) {
        return new User(user.userId, user.name, new Credentials(user.username, user.password));
    }
}
