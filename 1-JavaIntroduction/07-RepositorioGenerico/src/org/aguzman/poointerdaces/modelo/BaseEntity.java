package org.aguzman.poointerdaces.modelo;

import java.util.Objects;

public class BaseEntity {
    protected  Integer id;
    private static  int ultimoId;

    public BaseEntity(){this.id=++ultimoId;}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        BaseEntity.ultimoId = ultimoId;
    }


}
