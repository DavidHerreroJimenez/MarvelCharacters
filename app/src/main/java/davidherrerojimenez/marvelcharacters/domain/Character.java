
package davidherrerojimenez.marvelcharacters.domain;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Character implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;
    @SerializedName("urls")
    @Expose
    private List<Url> urls = null;
    @SerializedName("thumbnail")
    @Expose
    private Image thumbnail;
    @SerializedName("comics")
    @Expose
    private Comics comics;
    @SerializedName("stories")
    @Expose
    private Stories stories;
    @SerializedName("events")
    @Expose
    private Events events;
    @SerializedName("series")
    @Expose
    private Series series;
    public final static Creator<Character> CREATOR = new Creator<Character>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Character createFromParcel(Parcel in) {
            Character instance = new Character();
            instance.id = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.description = ((String) in.readValue((String.class.getClassLoader())));
            instance.modified = ((String) in.readValue((String.class.getClassLoader())));
            instance.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.urls, (Url.class.getClassLoader()));
            instance.thumbnail = ((Image) in.readValue((Image.class.getClassLoader())));
            instance.comics = ((Comics) in.readValue((Comics.class.getClassLoader())));
            instance.stories = ((Stories) in.readValue((Stories.class.getClassLoader())));
            instance.events = ((Events) in.readValue((Events.class.getClassLoader())));
            instance.series = ((Series) in.readValue((Series.class.getClassLoader())));
            return instance;
        }

        public Character[] newArray(int size) {
            return (new Character[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Character() {
    }

    /**
     * 
     * @param id
     * @param series
     * @param stories
     * @param thumbnail
     * @param resourceURI
     * @param events
     * @param urls
     * @param description
     * @param name
     * @param comics
     * @param modified
     */
    public Character(String id, String name, String description, String modified, String resourceURI, List<Url> urls, Image thumbnail, Comics comics, Stories stories, Events events, Series series) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.modified = modified;
        this.resourceURI = resourceURI;
        this.urls = urls;
        this.thumbnail = thumbnail;
        this.comics = comics;
        this.stories = stories;
        this.events = events;
        this.series = series;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Character withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character withName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Character withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public Character withModified(String modified) {
        this.modified = modified;
        return this;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public Character withResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
        return this;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public Character withUrls(List<Url> urls) {
        this.urls = urls;
        return this;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Character withThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public Comics getComics() {
        return comics;
    }

    public void setComics(Comics comics) {
        this.comics = comics;
    }

    public Character withComics(Comics comics) {
        this.comics = comics;
        return this;
    }

    public Stories getStories() {
        return stories;
    }

    public void setStories(Stories stories) {
        this.stories = stories;
    }

    public Character withStories(Stories stories) {
        this.stories = stories;
        return this;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public Character withEvents(Events events) {
        this.events = events;
        return this;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Character withSeries(Series series) {
        this.series = series;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(description);
        dest.writeValue(modified);
        dest.writeValue(resourceURI);
        dest.writeList(urls);
        dest.writeValue(thumbnail);
        dest.writeValue(comics);
        dest.writeValue(stories);
        dest.writeValue(events);
        dest.writeValue(series);
    }

    public int describeContents() {
        return  0;
    }

}
