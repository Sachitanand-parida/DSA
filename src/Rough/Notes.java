package Rough;

public class Notes {

    Integer sl;
    String tagName;
    Integer tagId;

    public Notes(Integer sl, String tagName, Integer tagId) {
        this.sl = sl;
        this.tagName = tagName;
        this.tagId = tagId;
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}

