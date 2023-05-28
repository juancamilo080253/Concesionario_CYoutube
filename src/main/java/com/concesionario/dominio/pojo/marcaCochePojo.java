package com.concesionario.dominio.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * pojo de marca coche
 */

@Getter
@Setter
public class marcaCochePojo {

    /**
     * Id de la marca
     */
    private Integer  id;
    /**
     * Descripcion de la marca
     */
    private String description;
}
