package br.com.pdpano.user.server.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public record User(
        UUID uuid,
        String name,
        Credentials credentials,
        boolean isActive,
        LocalDateTime createdAt
) {}