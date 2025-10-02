
package com.mycompany.superheroesjpa.entity;

import java.util.Objects;

/**
 *
 * @author claudia sheinbaum
 */
public class IdentidadSecreta {
    private String nombreReal;
    private String ciudad;
    private String ocupacion;

    public IdentidadSecreta() {
    }

    public IdentidadSecreta(String nombreReal, String ciudad, String ocupacion) {
        this.nombreReal = nombreReal;
        this.ciudad = ciudad;
        this.ocupacion = ocupacion;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nombreReal);
        hash = 47 * hash + Objects.hashCode(this.ciudad);
        hash = 47 * hash + Objects.hashCode(this.ocupacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final IdentidadSecreta other = (IdentidadSecreta) obj;
        if (!Objects.equals(this.nombreReal, other.nombreReal)) {
            return false;
        }
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        return Objects.equals(this.ocupacion, other.ocupacion);
    }

    @Override
    public String toString() {
        return "IdentidadSecreta{" + "nombreReal=" + nombreReal + ", ciudad=" + ciudad + ", ocupacion=" + ocupacion + '}';
    }
}
