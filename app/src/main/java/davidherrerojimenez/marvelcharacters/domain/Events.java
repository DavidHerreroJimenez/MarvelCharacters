
package davidherrerojimenez.marvelcharacters.domain;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Events implements Parcelable
{

    @SerializedName("available")
    @Expose
    private String available;
    @SerializedName("returned")
    @Expose
    private String returned;
    @SerializedName("collectionURI")
    @Expose
    private String collectionURI;
    @SerializedName("items")
    @Expose
    private List<EventSummary> items = null;
    public final static Creator<Events> CREATOR = new Creator<Events>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Events createFromParcel(Parcel in) {
            Events instance = new Events();
            instance.available = ((String) in.readValue((String.class.getClassLoader())));
            instance.returned = ((String) in.readValue((String.class.getClassLoader())));
            instance.collectionURI = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.items, (EventSummary.class.getClassLoader()));
            return instance;
        }

        public Events[] newArray(int size) {
            return (new Events[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Events() {
    }

    /**
     * 
     * @param items
     * @param collectionURI
     * @param available
     * @param returned
     */
    public Events(String available, String returned, String collectionURI, List<EventSummary> items) {
        super();
        this.available = available;
        this.returned = returned;
        this.collectionURI = collectionURI;
        this.items = items;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public Events withAvailable(String available) {
        this.available = available;
        return this;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }

    public Events withReturned(String returned) {
        this.returned = returned;
        return this;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public Events withCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
        return this;
    }

    public List<EventSummary> getItems() {
        return items;
    }

    public void setItems(List<EventSummary> items) {
        this.items = items;
    }

    public Events withItems(List<EventSummary> items) {
        this.items = items;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(available);
        dest.writeValue(returned);
        dest.writeValue(collectionURI);
        dest.writeList(items);
    }

    public int describeContents() {
        return  0;
    }

}
