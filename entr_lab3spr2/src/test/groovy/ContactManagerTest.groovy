
import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*

class ContactManagerTest {

    @Test
    void testGuardarContacto() {
        def manager = new ContactManager()
        def contacto = new Contacto(1L, "Juan Pérez", "juan@example.com", 30)

        manager.guardarContacto(contacto)
        assertEquals(1, manager.contactos.size())
        assertEquals("Juan Pérez", manager.contactos[0].nombre)
    }

    @Test
    void testBuscarContactos() {
        def manager = new ContactManager()
        manager.guardarContacto(new Contacto(1L, "Juan Pérez", "juan@example.com", 30))
        manager.guardarContacto(new Contacto(2L, "Ana López", "ana@example.com", 25))

        def resultados = manager.buscarContactos("Juan")
        assertEquals(1, resultados.size())
        assertEquals("Juan Pérez", resultados[0].nombre)
    }

    @Test
    void testBuscarContactoPorId() {
        def manager = new ContactManager()
        manager.guardarContacto(new Contacto(1L, "Juan Pérez", "juan@example.com", 30))

        def contacto = manager.buscarContacto(1L)
        assertNotNull(contacto)
        assertEquals("Juan Pérez", contacto.nombre)
    }

    @Test
    void testEliminarContacto() {
        def manager = new ContactManager()
        manager.guardarContacto(new Contacto(1L, "Juan Pérez", "juan@example.com", 30))

        def eliminado = manager.eliminarContacto(1L)
        assertTrue(eliminado)
        assertEquals(0, manager.contactos.size())
    }
}
