package com.concesionario.persistance.mapper;

import com.concesionario.dominio.pojo.marcaCochePojo;
import com.concesionario.persistance.entity.marcaCocheEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * mapper que transforma objetos de marca coche a pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface iMarcaCocheMapper {

    /**
     * Convierte un entity (por aqui lo recibe) y lo transformo a un pojo
     * @param marcaEntity Entidad a convertir
     * @return Pojo convertido
     */
    @Mapping(source = "id",target = "id" )
    @Mapping(source = "description",target = "description" )
    marcaCochePojo toMarcaCochePojo(marcaCocheEntity marcaEntity);

    /**
     * Convierto un pojo a una entidad de marca coche
     * @param marcaPojo pojo a convertir
     * @return Entity convertido
     */
    @InheritInverseConfiguration
    marcaCocheEntity toMarcaCocheEntity(marcaCochePojo marcaPojo);

    /**
     * Retorna una lista de marca coche tranformada a pojo de una lista de entidades
     * @param marcasCocheEntity Entidad a transformar
     * @return lista transformada
     */
    List<marcaCochePojo> toMarcaCochePojos(List<marcaCocheEntity> marcasCocheEntity);
}
