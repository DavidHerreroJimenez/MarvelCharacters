
package davidherrerojimenez.marvelcharacters.domain;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterDataWrapper implements Parcelable
{

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("attributionText")
    @Expose
    private String attributionText;
    @SerializedName("attributionHTML")
    @Expose
    private String attributionHTML;
    @SerializedName("data")
    @Expose
    private CharacterDataContainer data;
    @SerializedName("etag")
    @Expose
    private String etag;
    public final static Creator<CharacterDataWrapper> CREATOR = new Creator<CharacterDataWrapper>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CharacterDataWrapper createFromParcel(Parcel in) {
            CharacterDataWrapper instance = new CharacterDataWrapper();
            instance.code = ((String) in.readValue((String.class.getClassLoader())));
            instance.status = ((String) in.readValue((String.class.getClassLoader())));
            instance.copyright = ((String) in.readValue((String.class.getClassLoader())));
            instance.attributionText = ((String) in.readValue((String.class.getClassLoader())));
            instance.attributionHTML = ((String) in.readValue((String.class.getClassLoader())));
            instance.data = ((CharacterDataContainer) in.readValue((CharacterDataContainer.class.getClassLoader())));
            instance.etag = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public CharacterDataWrapper[] newArray(int size) {
            return (new CharacterDataWrapper[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CharacterDataWrapper() {
    }

    /**
     * 
     * @param attributionText
     * @param etag
     * @param status
     * @param data
     * @param copyright
     * @param code
     * @param attributionHTML
     */
    public CharacterDataWrapper(String code, String status, String copyright, String attributionText, String attributionHTML, CharacterDataContainer data, String etag) {
        super();
        this.code = code;
        this.status = status;
        this.copyright = copyright;
        this.attributionText = attributionText;
        this.attributionHTML = attributionHTML;
        this.data = data;
        this.etag = etag;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CharacterDataWrapper withCode(String code) {
        this.code = code;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CharacterDataWrapper withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public CharacterDataWrapper withCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }

    public CharacterDataWrapper withAttributionText(String attributionText) {
        this.attributionText = attributionText;
        return this;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }

    public CharacterDataWrapper withAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
        return this;
    }

    public CharacterDataContainer getData() {
        return data;
    }

    public void setData(CharacterDataContainer data) {
        this.data = data;
    }

    public CharacterDataWrapper withData(CharacterDataContainer data) {
        this.data = data;
        return this;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public CharacterDataWrapper withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(code);
        dest.writeValue(status);
        dest.writeValue(copyright);
        dest.writeValue(attributionText);
        dest.writeValue(attributionHTML);
        dest.writeValue(data);
        dest.writeValue(etag);
    }

    public int describeContents() {
        return  0;
    }

}
