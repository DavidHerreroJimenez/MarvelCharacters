
package davidherrerojimenez.marvelcharacters.domain;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url implements Parcelable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("url")
    @Expose
    private String url;
    public final static Creator<Url> CREATOR = new Creator<Url>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Url createFromParcel(Parcel in) {
            Url instance = new Url();
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Url[] newArray(int size) {
            return (new Url[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Url() {
    }

    /**
     * 
     * @param type
     * @param url
     */
    public Url(String type, String url) {
        super();
        this.type = type;
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Url withType(String type) {
        this.type = type;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Url withUrl(String url) {
        this.url = url;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(url);
    }

    public int describeContents() {
        return  0;
    }

}
