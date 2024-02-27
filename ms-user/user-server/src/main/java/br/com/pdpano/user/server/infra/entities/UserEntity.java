package br.com.pdpano.user.server.infra.entities;

import br.com.pdpano.user.server.domain.Credentials;
import br.com.pdpano.user.server.domain.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "tb_users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID uuid;
    public String name;
    public String username;
    public String password;
    public boolean isActive;
    public LocalDateTime createdAt;

    public UserEntity() {}

    public UserEntity(UUID uuid, String name, String username, String password, boolean isActive, LocalDateTime createdAt) {
        this.uuid = uuid;
        this.name = name;
        this.username = username;
        this.password = password;
        this.isActive = isActive;
        this.createdAt = createdAt;
    }

    public static UserEntity toEntity(User user) {
        return new UserEntity(
                user.uuid(),
                user.name(),
                user.credentials().username(),
                user.credentials().password(),
                user.isActive(),
                user.createdAt()
        );
    }

    public static User toDomain(UserEntity user) {
        return new User(
                user.uuid,
                user.name,
                new Credentials(user.username, user.password),
                user.isActive,
                user.createdAt
        );
    }
}
