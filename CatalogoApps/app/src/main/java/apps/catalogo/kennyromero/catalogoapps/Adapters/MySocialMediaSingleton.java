package apps.catalogo.kennyromero.catalogoapps.Adapters;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.LruCache;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/**
 * Created by kenny.romero on 08/02/2016.
 */
public class MySocialMediaSingleton {

    // Atributos
    private static MySocialMediaSingleton singleton;
    private ImageLoader imageLoader;
    private RequestQueue requestQueue;
    private static Context context;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    private MySocialMediaSingleton(Context context) {
        MySocialMediaSingleton.context = context;
        requestQueue = getRequestQueue();

        imageLoader = new ImageLoader(requestQueue,
                new ImageLoader.ImageCache() {
                    private final LruCache<String, Bitmap>
                            cache = new LruCache<>(20);

                    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
                    @Override
                    public Bitmap getBitmap(String url) {
                        return cache.get(url);
                    }

                    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
                    @Override
                    public void putBitmap(String url, Bitmap bitmap) {
                        cache.put(url, bitmap);
                    }
                });
    }

    public static synchronized MySocialMediaSingleton getInstance(Context context) {
        if (singleton == null) {
            singleton = new MySocialMediaSingleton(context);
        }
        return singleton;
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(context.getApplicationContext());
        }
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }

}