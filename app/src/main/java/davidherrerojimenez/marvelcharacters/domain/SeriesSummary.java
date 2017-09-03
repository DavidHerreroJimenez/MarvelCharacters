
package davidherrerojimenez.marvelcharacters.domain;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SeriesSummary implements Parcelable
{

    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;
    @SerializedName("name")
    @Expose
    private String name;
    public final static Creator<SeriesSummary> CREATOR = new Creator<SeriesSummary>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SeriesSummary createFromParcel(Parcel in) {
            SeriesSummary instance = new SeriesSummary();
            instance.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public SeriesSummary[] newArray(int size) {
            return (new SeriesSummary[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SeriesSummary() {
    }

    /**
     * 
     * @param resourceURI
     * @param name
     */
    public SeriesSummary(String resourceURI, String name) {
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

    public SeriesSummary withResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SeriesSummary withName(String name) {
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
