
package davidherrerojimenez.marvelcharacters.domain;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StorySummary implements Parcelable
{

    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    public final static Creator<StorySummary> CREATOR = new Creator<StorySummary>() {


        @SuppressWarnings({
            "unchecked"
        })
        public StorySummary createFromParcel(Parcel in) {
            StorySummary instance = new StorySummary();
            instance.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public StorySummary[] newArray(int size) {
            return (new StorySummary[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StorySummary() {
    }

    /**
     * 
     * @param resourceURI
     * @param name
     * @param type
     */
    public StorySummary(String resourceURI, String name, String type) {
        super();
        this.resourceURI = resourceURI;
        this.name = name;
        this.type = type;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public StorySummary withResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StorySummary withName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StorySummary withType(String type) {
        this.type = type;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(resourceURI);
        dest.writeValue(name);
        dest.writeValue(type);
    }

    public int describeContents() {
        return  0;
    }

}
