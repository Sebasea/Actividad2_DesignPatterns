public class PedidoProductoRopa extends ProcesoPedido{
    @Override
    protected void verificarInventario(Producto producto) {
        System.out.println("Verificando inventario del: "+producto.getNombre());
    }

    @Override
    protected void totalPedido(Producto producto) {
        System.out.println("Calculando el valor total del pedido: "+producto.getPrecio());
    }

    @Override
    protected void facturar(Producto producto) {
        System.out.println("Facturando al cliente el valor del pedido: "+producto.getPrecio());
    }

    @Override
    protected void notificarCliente(Producto producto) {
        System.out.println("Notificando al cliente que se realizo correctamente el pedido del: "+producto.getNombre());
    }
}
