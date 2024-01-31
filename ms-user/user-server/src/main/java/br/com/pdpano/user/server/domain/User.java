package br.com.pdpano.user.server.domain;

import java.time.LocalDateTime;

public record User(Long id, String name, Credentials credentials, boolean isActive, LocalDateTime createdAt) {}