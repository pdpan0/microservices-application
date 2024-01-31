package br.com.pdpano.user.server.infra.entities;

import br.com.pdpano.user.server.domain.Credentials;
import br.com.pdpano.user.server.domain.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity(name = "tb_users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long userId;
    public String name;
    public String username;
    public String password;
    public boolean isActive;
    public LocalDateTime createdAt;

    public UserEntity() {}

    public UserEntity(Long userId, String name, String username, String password, boolean isActive, LocalDateTime createdAt) {
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.password = password;
        this.isActive = isActive;
        this.createdAt = createdAt;
    }

    public static UserEntity toEntity(User user) {
        return new UserEntity(
                user.id(),
                user.name(),
                user.credentials().username(),
                user.credentials().password(),
                user.isActive(),
                user.createdAt()
        );
    }

    public static User toDomain(UserEntity user) {
        return new User(
                user.userId,
                user.name,
                new Credentials(user.username, user.password),
                user.isActive,
                user.createdAt
        );
    }
}
