package apps.catalogo.kennyromero.catalogoapps.actividades;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;

import org.w3c.dom.Text;

import apps.catalogo.kennyromero.catalogoapps.R;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";
    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        final ImageView img_detail = (ImageView)findViewById(R.id.img_detail);
        TextView title_app =(TextView)findViewById(R.id.title_app);
        TextView summary_app = (TextView)findViewById(R.id.summary_app);
        TextView author_app = (TextView)findViewById(R.id.author_app);
        TextView category_app = (TextView)findViewById(R.id.category_app);
        TextView link_app = (TextView)findViewById(R.id.link_app);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String tmp = extras.getString("titulo");
        title_app.setText(extras.getString("titulo"));
        summary_app.setText(extras.getString("descrip"));
        author_app.setText(extras.getString("artist"));
        category_app.setText(extras.getString("category"));
        link_app.setText(extras.getString("link_app"));

        // Crear nueva cola de peticiones
        requestQueue = Volley.newRequestQueue(getApplicationContext());

        // Petición para obtener la imagen
        ImageRequest request = new ImageRequest(
                extras.getString("image"),
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap bitmap) {
                        img_detail.setImageBitmap(bitmap);
                    }
                }, 0, 0, null,null,
                new Response.ErrorListener() {
                    public void onErrorResponse(VolleyError error) {
                        img_detail.setImageResource(R.drawable.box);
                        Log.d(TAG, "Error en respuesta Bitmap: " + error.getMessage());
                    }
                });

        // Añadir petición a la cola
        requestQueue.add(request);





    }
}
