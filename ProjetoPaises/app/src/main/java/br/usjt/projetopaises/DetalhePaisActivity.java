/* Nome: Leila Añez de Oliveira
RA: 81618710
 */

package br.usjt.projetopaises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhePaisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        TextView txtPais = (TextView)findViewById(R.id.txtPais);
        Intent intent = getIntent();
        Pais pais = (Pais)intent.getSerializableExtra(ListarPaisesActivity.PAIS);
        txtPais.setText(pais.toString());
    }
}
