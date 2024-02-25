package co.edu.unipiloto.productadvisor;

        import java.util.ArrayList;
        import java.util.List;

public class ProductExpert {
    public List<String> getProducts(String type) {
        List<String> products = new ArrayList<>();
        switch (type) {
            case "Mercancías Sólidas":
                products.add("Electrodomésticos");
                products.add("Muebles");
                products.add("Herramientas");
                products.add("Equipos Electrónicos");
                break;
            case "Productos Agrícolas":
                products.add("Frutas (bulto)");
                products.add("Verduras (bulto)");
                products.add("Granos (a granel)");
                products.add("Café (a granel)");
                break;
            case "Líquidos":
                products.add("Agua");
                products.add("Gasolina");
                products.add("Petróleo");
                products.add("Vino");
                products.add("Aceite de Oliva");
                break;
            default:
                products.add("Tipo de producto desconocido");
                break;
        }
        return products;
    }
}
