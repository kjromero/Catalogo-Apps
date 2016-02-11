package apps.catalogo.kennyromero.catalogoapps.data;

/**
 * Created by kenny.romero on 06/02/2016.
 */
public class Post {

    private String im_name;
    private String im_image;
    private String im_image2;
    private String summary;
    private String price;
    private String currency;
    private String contentType;
    private String rights;
    private String title;
    private String link;
    private String id;
    private String artist;
    private String linkArtist;
    private String category;
    private String im_releaseDate;

    public Post() {
    }

    public Post(String im_name, String im_image, String im_image2, String summary, String price,
                String currency, String contentType , String rights, String title, String link,
                String id, String artist, String linkArtist, String category, String im_releaseDate ){

        this.im_name = im_name;
        this.im_image = im_image;
        this.im_image2 = im_image2;
        this.summary = summary;
        this.price = price;
        this.currency = currency;
        this.contentType = contentType;
        this.rights = rights;
        this.title = title;
        this.link = link;
        this.id = id;
        this.artist = artist;
        this.linkArtist = linkArtist;
        this.category = category;
        this.im_releaseDate = im_releaseDate;

    }

    public String getIm_name() {
        return im_name;
    }

    public void setIm_name(String im_name) {
        this.im_name = im_name;
    }

    public String getIm_image() {
        return im_image;
    }

    public void setIm_image(String im_image) {
        this.im_image = im_image;
    }

    public String getIm_image2() {
        return im_image2;
    }

    public void setIm_image2(String im_image2) {
        this.im_image2 = im_image2;
    }

    public String getLinkArtist() {
        return linkArtist;
    }

    public void setLinkArtist(String linkArtist) {
        this.linkArtist = linkArtist;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIm_releaseDate() {
        return im_releaseDate;
    }

    public void setIm_releaseDate(String im_releaseDate) {
        this.im_releaseDate = im_releaseDate;
    }
}
