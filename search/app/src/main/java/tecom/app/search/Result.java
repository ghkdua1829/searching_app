package tecom.app.search;

public class Result {
    String title;
    String link;
    String description;
    String blogername;
    String bloggerlink;
    String postdate;

    public Result(String title, String link, String description, String blogername, String bloggerlink, String postdate) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.blogername = blogername;
        this.bloggerlink = bloggerlink;
        this.postdate = postdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlogername() {
        return blogername;
    }

    public void setBlogername(String blogername) {
        this.blogername = blogername;
    }

    public String getBloggerlink() {
        return bloggerlink;
    }

    public void setBloggerlink(String bloggerlink) {
        this.bloggerlink = bloggerlink;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }
}
