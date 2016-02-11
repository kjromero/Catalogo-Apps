package apps.catalogo.kennyromero.catalogoapps.data;

import java.util.List;

/**
 * Created by kenny.romero on 08/02/2016.
 */
public class ListaPost {

    // Encapsulamiento de Posts
    private List<Post> items;

    public ListaPost(List<Post> items) {
        this.items = items;
    }

    public void setItems(List<Post> items) {
        this.items = items;
    }

    public List<Post> getItems() {
        return items;
    }
}
