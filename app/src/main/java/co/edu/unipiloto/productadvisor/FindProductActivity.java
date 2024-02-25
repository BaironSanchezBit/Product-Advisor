package co.edu.unipiloto.productadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import co.edu.unipiloto.productadvisor.ProductExpert;

import java.util.List;

public class FindProductActivity extends Activity {

    private ProductExpert expert = new ProductExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_product);
    }

    public void onClickFindProduct(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner product = (Spinner) findViewById(R.id.product);
        String productType = String.valueOf(product.getSelectedItem());

        List<String> brandList = expert.getProducts(productType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandList) {
            brandsFormatted.append(brand).append('\n');
        }

        brands.setText(brandsFormatted);
    }
}
