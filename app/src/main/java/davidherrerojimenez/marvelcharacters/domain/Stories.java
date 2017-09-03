
package davidherrerojimenez.marvelcharacters.domain;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stories implements Parcelable
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
    private List<StorySummary> items = null;
    public final static Creator<Stories> CREATOR = new Creator<Stories>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Stories createFromParcel(Parcel in) {
            Stories instance = new Stories();
            instance.available = ((String) in.readValue((String.class.getClassLoader())));
            instance.returned = ((String) in.readValue((String.class.getClassLoader())));
            instance.collectionURI = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.items, (StorySummary.class.getClassLoader()));
            return instance;
        }

        public Stories[] newArray(int size) {
            return (new Stories[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stories() {
    }

    /**
     * 
     * @param items
     * @param collectionURI
     * @param available
     * @param returned
     */
    public Stories(String available, String returned, String collectionURI, List<StorySummary> items) {
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

    public Stories withAvailable(String available) {
        this.available = available;
        return this;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }

    public Stories withReturned(String returned) {
        this.returned = returned;
        return this;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public Stories withCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
        return this;
    }

    public List<StorySummary> getItems() {
        return items;
    }

    public void setItems(List<StorySummary> items) {
        this.items = items;
    }

    public Stories withItems(List<StorySummary> items) {
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
