# Contact Manager - Gestión de Contactos

## Descripción del Proyecto
Este proyecto es una aplicación de gestión de contactos desarrollada en **Groovy** con un enfoque de **Desarrollo Dirigido por Pruebas (TDD)**. La aplicación permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre una lista de contactos almacenada en memoria. 

El proyecto utiliza **Maven** para la gestión de dependencias y JUnit 5 para las pruebas unitarias.

---

## Funcionalidades
1. **CRUD de Contactos:**
   - Guardar un contacto.
   - Buscar contactos por nombre.
   - Buscar un contacto por ID.
   - Eliminar un contacto por ID.
   
2. **Clase `Contacto`:**
   - Atributos: `id`, `nombre`, `email`, `edad`.
   - Métodos: getters, setters y `toString`.

3. **Gestión en Memoria:**
   - Los contactos se almacenan en una lista de tipo `ArrayList` en memoria.

4. **Pruebas Unitarias:**
   - Verificación de todas las funcionalidades CRUD utilizando JUnit 5.

---

## Tecnologías Utilizadas
- **Groovy**: Lenguaje dinámico basado en JVM.
- **JUnit 5**: Framework para pruebas unitarias.
- **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.

---

## Requisitos Previos
- **Java 17** o superior.
- **Maven** instalado y configurado en tu sistema.
- **IDE compatible con Groovy** (como IntelliJ IDEA, VS Code con extensiones para Groovy).

---

## Instalación y Ejecución

### 1. Clonar el Repositorio
```bash
git clone <URL_DEL_REPOSITORIO>
cd ContactManager
