
package davidherrerojimenez.marvelcharacters.domain;

import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comics implements Parcelable
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

    private List<ComicSummary> items = null;
    public final static Creator<Comics> CREATOR = new Creator<Comics>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Comics createFromParcel(Parcel in) {
            Comics instance = new Comics();
            instance.available = ((String) in.readValue((String.class.getClassLoader())));
            instance.returned = ((String) in.readValue((String.class.getClassLoader())));
            instance.collectionURI = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.items, (ComicSummary.class.getClassLoader()));
            return instance;
        }

        public Comics[] newArray(int size) {
            return (new Comics[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Comics() {
    }

    /**
     * 
     * @param items
     * @param collectionURI
     * @param available
     * @param returned
     */
    public Comics(String available, String returned, String collectionURI, List<ComicSummary> items) {
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

    public Comics withAvailable(String available) {
        this.available = available;
        return this;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }

    public Comics withReturned(String returned) {
        this.returned = returned;
        return this;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public Comics withCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
        return this;
    }

    public List<ComicSummary> getItems() {
        return items;
    }

    public void setItems(List<ComicSummary> items) {
        this.items = items;
    }

    public Comics withItems(List<ComicSummary> items) {
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
