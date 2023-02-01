package org.ujar.jh.petclinic.minimal.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import org.ujar.jh.petclinic.minimal.domain.Owners;

/**
 * Spring Data JPA repository for the Owners entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OwnersRepository extends JpaRepository<Owners, Long> {}
