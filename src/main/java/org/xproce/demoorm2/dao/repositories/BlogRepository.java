package org.xproce.demoorm2.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.demoorm2.dao.entities.Blog;

public interface BlogRepository
        extends JpaRepository<Blog, Integer> {
}
