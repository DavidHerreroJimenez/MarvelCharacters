
package davidherrerojimenez.marvelcharacters.domain;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image implements Parcelable
{

    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("extension")
    @Expose
    private String extension;
    public final static Creator<Image> CREATOR = new Creator<Image>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Image createFromParcel(Parcel in) {
            Image instance = new Image();
            instance.path = ((String) in.readValue((String.class.getClassLoader())));
            instance.extension = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Image[] newArray(int size) {
            return (new Image[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param extension
     * @param path
     */
    public Image(String path, String extension) {
        super();
        this.path = path;
        this.extension = extension;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Image withPath(String path) {
        this.path = path;
        return this;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Image withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(path);
        dest.writeValue(extension);
    }

    public int describeContents() {
        return  0;
    }

}
