package dev.knowhowto.jh.petclinic.minimal.service.mapper;

import org.mapstruct.*;
import dev.knowhowto.jh.petclinic.minimal.domain.Pets;
import dev.knowhowto.jh.petclinic.minimal.domain.Visits;
import dev.knowhowto.jh.petclinic.minimal.service.dto.PetsDTO;
import dev.knowhowto.jh.petclinic.minimal.service.dto.VisitsDTO;

/**
 * Mapper for the entity {@link Visits} and its DTO {@link VisitsDTO}.
 */
@Mapper(componentModel = "spring")
public interface VisitsMapper extends EntityMapper<VisitsDTO, Visits> {
    @Mapping(target = "pet", source = "pet", qualifiedByName = "petsId")
    VisitsDTO toDto(Visits s);

    @Named("petsId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PetsDTO toDtoPetsId(Pets pets);
}
