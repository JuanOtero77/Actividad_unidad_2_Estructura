/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_2;

/**
 *
 * @author PC
 */
public class Principal {
    public static void main(String[] args) {
        // Crear objetos de las clases
        Categoria categoria1 = new Categoria("Electrónicos");
        cliente cliente1 = new cliente("1234567890", "Juan", "Pérez", "Gómez", "M", "1990-01-01", "1234567890", "juan@example.com", "Calle 123", "Activo");
        producto producto1 = new producto(1, "Teléfono", "Samsung", "Negro", 500.0, 800.0, 0.1, 10);
        compra compra1 = new compra("1", "2023-06-28", "Proveedor1", producto1, 400.0, 5, 400.0, 80.0, 480.0);

        // Crear instancias de las libretas
        LibretaCliente libretaCliente = new LibretaCliente();
        libretaCompra libretaCompra = new libretaCompra();
        libretaProducto libretaProducto = new libretaProducto();
        libretaVenta libretaVenta = new libretaVenta();

        // Agregar objetos a las libretas
        libretaCliente.AgregarCliente(cliente1);
        libretaCompra.AgregarCliente(compra1);
        libretaProducto.AgregarProducto(producto1);

        // Ejemplo de uso de los métodos de las libretas
        cliente clienteEncontrado = libretaCliente.buscarCliente("1234567890");
        System.out.println("Cliente encontrado: " + clienteEncontrado.getNombre());

        compra compraEncontrada = libretaCompra.buscarCompra("1");
        System.out.println("Compra encontrada: " + compraEncontrada.getConsecutivo());

        producto productoEncontrado = libretaProducto.buscarProducto(1);
        System.out.println("Producto encontrado: " + productoEncontrado.getNombre());
    }
}
