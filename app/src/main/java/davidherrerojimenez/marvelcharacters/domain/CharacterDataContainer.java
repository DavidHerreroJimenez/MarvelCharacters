
package davidherrerojimenez.marvelcharacters.domain;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CharacterDataContainer implements Parcelable
{

    @SerializedName("offset")
    @Expose
    private String offset;
    @SerializedName("limit")
    @Expose
    private String limit;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("count")
    @Expose
    private String count;
    @SerializedName("results")
    @Expose
    private List<Character> results = null;
    public final static Creator<CharacterDataContainer> CREATOR = new Creator<CharacterDataContainer>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CharacterDataContainer createFromParcel(Parcel in) {
            CharacterDataContainer instance = new CharacterDataContainer();
            instance.offset = ((String) in.readValue((String.class.getClassLoader())));
            instance.limit = ((String) in.readValue((String.class.getClassLoader())));
            instance.total = ((String) in.readValue((String.class.getClassLoader())));
            instance.count = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.results, (Character.class.getClassLoader()));
            return instance;
        }

        public CharacterDataContainer[] newArray(int size) {
            return (new CharacterDataContainer[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CharacterDataContainer() {
    }

    /**
     * 
     * @param total
     * @param limit
     * @param results
     * @param count
     * @param offset
     */
    public CharacterDataContainer(String offset, String limit, String total, String count, List<Character> results) {
        super();
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.count = count;
        this.results = results;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public CharacterDataContainer withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public CharacterDataContainer withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public CharacterDataContainer withTotal(String total) {
        this.total = total;
        return this;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public CharacterDataContainer withCount(String count) {
        this.count = count;
        return this;
    }

    public List<Character> getResults() {
        return results;
    }

    public void setResults(List<Character> results) {
        this.results = results;
    }

    public CharacterDataContainer withResults(List<Character> results) {
        this.results = results;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(offset);
        dest.writeValue(limit);
        dest.writeValue(total);
        dest.writeValue(count);
        dest.writeList(results);
    }

    public int describeContents() {
        return  0;
    }

}
