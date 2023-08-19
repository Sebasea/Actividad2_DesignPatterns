public class Main {
    public static void main(String[] args) {
        Producto prElectronico = new Producto("Televisor LG", 3500000);
        Producto prAlimento = new Producto("Arepa", 3500);
        Producto prRopa = new Producto("Chaqueta H&M", 45000);

        PedidoProductoElectronico pedidoProductoElectronicom = new PedidoProductoElectronico();
        PedidoProductoAlimento pedidoProductoAlimento = new PedidoProductoAlimento();
        PedidoProductoRopa pedidoProductoRopa = new PedidoProductoRopa();

        pedidoProductoElectronicom.procesoPedido(prElectronico);
        pedidoProductoAlimento.procesoPedido(prAlimento);
        pedidoProductoRopa.procesoPedido(prRopa);
    }
}