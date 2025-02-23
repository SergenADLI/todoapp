package com.hotsoup.infrastructure.repositories;

import com.hotsoup.application.interfaces.ITodoRepository;
import com.hotsoup.domain.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>, ITodoRepository {
}