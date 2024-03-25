package org.xproce.demoorm2.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.demoorm2.dao.entities.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
