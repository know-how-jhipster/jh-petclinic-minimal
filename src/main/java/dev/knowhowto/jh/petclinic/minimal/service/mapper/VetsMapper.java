package dev.knowhowto.jh.petclinic.minimal.service.mapper;

import org.mapstruct.*;
import dev.knowhowto.jh.petclinic.minimal.domain.Vets;
import dev.knowhowto.jh.petclinic.minimal.service.dto.VetsDTO;

/**
 * Mapper for the entity {@link Vets} and its DTO {@link VetsDTO}.
 */
@Mapper(componentModel = "spring")
public interface VetsMapper extends EntityMapper<VetsDTO, Vets> {}
