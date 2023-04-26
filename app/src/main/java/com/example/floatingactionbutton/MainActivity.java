package com.example.floatingactionbutton;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "FAB pressionado", Snackbar.LENGTH_LONG)
                        .setAction("Confirmar", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflar o menu; isso adiciona itens à barra de ação, se estiver presente.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /* Lida com cliques de itens da barra de ação aqui. A barra de ação manipulará automaticamente os cliques no
        botão Home/Up, desde que você especifique uma atividade pai no AndroidManifest.xml.*/
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

/*Anotações:
*
* O MainActivity carrega o layout activity_main.xml e ele por sua vez tem um include de content_main.xml que carrega para dentro do activity_main.xml
* o content_main.xml. Com o 'include' é possível adicionar trechos de códigos para serem executados dentro desse activity.
*
* Exemplificando - no arquivo activity_main.xml: <include layout="@layout/content_main" />
*
* Botão de ação flutuante
* Um botão de ação flutuante (FAB) é um botão circular que aciona a ação principal na interface do usuário do seu aplicativo. Esta página mostra como
* adicionar o FAB ao seu layout, personalizar parte de sua aparência e responder a toques de botão.
*
* Você pode configurar outras propriedades FAB usando atributos XML ou métodos correspondentes, como o seguinte:
*   -> O tamanho do FAB, usando o app:fabSizeatributo ou o setSize()método.
*   -> A cor da ondulação do FAB, usando o app:rippleColoratributo ou o setRippleColor()método.
*   -> O ícone FAB, usando o android:srcatributo ou o setImageDrawable()método.
* */
