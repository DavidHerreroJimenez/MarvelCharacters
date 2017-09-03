
package davidherrerojimenez.marvelcharacters.domain;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ComicSummary implements Parcelable
{

    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;
    @SerializedName("name")
    @Expose
    private String name;
    public final static Creator<ComicSummary> CREATOR = new Creator<ComicSummary>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ComicSummary createFromParcel(Parcel in) {
            ComicSummary instance = new ComicSummary();
            instance.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public ComicSummary[] newArray(int size) {
            return (new ComicSummary[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ComicSummary() {
    }

    /**
     * 
     * @param resourceURI
     * @param name
     */
    public ComicSummary(String resourceURI, String name) {
        super();
        this.resourceURI = resourceURI;
        this.name = name;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public ComicSummary withResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComicSummary withName(String name) {
        this.name = name;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(resourceURI);
        dest.writeValue(name);
    }

    public int describeContents() {
        return  0;
    }

}
