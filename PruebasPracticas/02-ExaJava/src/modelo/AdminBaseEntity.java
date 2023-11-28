package modelo;

import java.util.Objects;

public class AdminBaseEntity {
    protected Integer id;
    private static int ultimoId;

    public AdminBaseEntity() {
        this.id = ++ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminBaseEntity that = (AdminBaseEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
