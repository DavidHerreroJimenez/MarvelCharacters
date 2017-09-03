
package davidherrerojimenez.marvelcharacters.domain;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Series implements Parcelable
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
    private List<SeriesSummary> items = null;
    public final static Creator<Series> CREATOR = new Creator<Series>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Series createFromParcel(Parcel in) {
            Series instance = new Series();
            instance.available = ((String) in.readValue((String.class.getClassLoader())));
            instance.returned = ((String) in.readValue((String.class.getClassLoader())));
            instance.collectionURI = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.items, (SeriesSummary.class.getClassLoader()));
            return instance;
        }

        public Series[] newArray(int size) {
            return (new Series[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Series() {
    }

    /**
     * 
     * @param items
     * @param collectionURI
     * @param available
     * @param returned
     */
    public Series(String available, String returned, String collectionURI, List<SeriesSummary> items) {
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

    public Series withAvailable(String available) {
        this.available = available;
        return this;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }

    public Series withReturned(String returned) {
        this.returned = returned;
        return this;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public Series withCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
        return this;
    }

    public List<SeriesSummary> getItems() {
        return items;
    }

    public void setItems(List<SeriesSummary> items) {
        this.items = items;
    }

    public Series withItems(List<SeriesSummary> items) {
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
