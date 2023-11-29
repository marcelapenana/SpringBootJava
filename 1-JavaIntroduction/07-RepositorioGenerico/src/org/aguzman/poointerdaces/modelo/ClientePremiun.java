package org.aguzman.poointerdaces.modelo;

public class ClientePremiun extends Cliente implements Comparable<ClientePremiun>{

    public ClientePremiun() {
    }

    public ClientePremiun(Integer id, String nombre, String apellido) {
        super(id, nombre, apellido);
    }

    @Override
    public int compareTo(ClientePremiun o) {
        return 0;
    }
}
