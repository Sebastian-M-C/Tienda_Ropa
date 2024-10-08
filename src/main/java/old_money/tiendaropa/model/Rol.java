package old_money.tiendaropa.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rol;

    @Column(nullable = false)
    private String tipo_rol;

    public Rol(Long id_rol, String tipo_rol) {
        this.id_rol = id_rol;
        this.tipo_rol = tipo_rol;
    }

    public Rol(String tipo_rol) {
        this.tipo_rol = tipo_rol;
    }

    public Rol() {
    }

    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public String getTipo_rol() {
        return tipo_rol;
    }

    public void setTipo_rol(String tipo_rol) {
        this.tipo_rol = tipo_rol;
    }
}
