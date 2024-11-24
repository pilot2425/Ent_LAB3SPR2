

class Contacto {
    Long id
    String nombre
    String email
    Integer edad

    Contacto() {}

    Contacto(Long id, String nombre, String email, Integer edad) {
        this.id = id
        this.nombre = nombre
        this.email = email
        this.edad = edad
    }

    Long getId() { id }
    void setId(Long id) { this.id = id }

    String getNombre() { nombre }
    void setNombre(String nombre) { this.nombre = nombre }

    String getEmail() { email }
    void setEmail(String email) { this.email = email }

    Integer getEdad() { edad }
    void setEdad(Integer edad) { this.edad = edad }

    @Override
    String toString() {
        "Contacto(id=$id, nombre=$nombre, email=$email, edad=$edad)"
    }
}
