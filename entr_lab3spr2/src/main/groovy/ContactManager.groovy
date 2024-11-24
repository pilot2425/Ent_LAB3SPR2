

class ContactManager {
    private List<Contacto> contactos = []

    void guardarContacto(Contacto contacto) {
        contactos << contacto
    }

    List<Contacto> buscarContactos(String nombre) {
        contactos.findAll { it.nombre.contains(nombre) }
    }

    Contacto buscarContacto(Long id) {
        contactos.find { it.id == id }
    }

    boolean eliminarContacto(Long id) {
        contactos.removeIf { it.id == id }
    }
}
