package apps.catalogo.kennyromero.catalogoapps.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import apps.catalogo.kennyromero.catalogoapps.Adapters.PostAdapter;
import apps.catalogo.kennyromero.catalogoapps.R;
import apps.catalogo.kennyromero.catalogoapps.data.Post;

public class MainActivity extends AppCompatActivity {

   // public static final String URL = "https://itunes.apple.com/us/rss/topfreeapplications/limit=20/json";
    private GridView gvApps;
    private ArrayAdapter gvAdapter;
    public static List<Post> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gvApps = (GridView)findViewById(R.id.grid);

        // Crear y setear adaptador
        gvAdapter = new PostAdapter(getApplicationContext());
        gvApps.setAdapter(gvAdapter);

        gvApps.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Obtener el item actual
                Post item = items.get(position);
                item.getArtist();
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("titulo", item.getTitle());
                intent.putExtra("image", item.getIm_image2());
                intent.putExtra("descrip", item.getSummary());
                intent.putExtra("artist", item.getArtist());
                intent.putExtra("category", item.getCategory());
                intent.putExtra("link", item.getLink());
                startActivity(intent);



            }
        });


    }
}





/*

final TextView texto = (TextView)findViewById(R.id.texto);

JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET, URL, (String)null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONObject feed = response.getJSONObject("feed");
                    JSONObject autor = feed.getJSONObject("author");
                    JSONObject nombre = autor.getJSONObject("name");
                    String label = nombre.getString("label");

                    JSONArray entry = feed.getJSONArray("entry");
                    for(int i = 0 ; i <= entry.length() ; i++){
                        JSONObject obj = entry.getJSONObject(i);
                        JSONArray app = obj.getJSONArray("im:image");
                        for(int j = 0 ; j <= app.length() ; j++){
                            JSONObject obj2 = app.getJSONObject(j);
                            JSONObject atributes = obj2.getJSONObject("attributes");
                            texto.append("Label "+obj2.getString("label")+"\n"+"Tamaño "+atributes.getString("height")+"\n\n\n");
                        }
                    }

                    Toast.makeText(getApplicationContext(),"Funciono",Toast.LENGTH_LONG).show();



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),"NOOO Funciono",Toast.LENGTH_LONG).show();
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);

 */