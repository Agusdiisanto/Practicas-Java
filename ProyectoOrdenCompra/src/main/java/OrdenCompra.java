import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class OrdenCompra {
   private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProductos;
    private int ultimoId;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ++ultimoId;
        this.productos = new Producto[4];
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto (Producto producto){

        if (indiceProductos < this.productos.length){
            this.productos[indiceProductos++] = producto;
        }
    }

    public int getGranTotal(){
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();

        }
        return total;
    }
}

