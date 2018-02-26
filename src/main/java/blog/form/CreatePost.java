package blog.form;

public class CreatePost {
    private String title;
    private String body;
    private String SpringBlog;
    private String JavaBlog;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSpringBlog() {
        return SpringBlog;
    }

    public void setSpringBlog(String springBlog) {
        SpringBlog = springBlog;
    }

    public String getJavaBlog() {
        return JavaBlog;
    }

    public void setJavaBlog(String javaBlog) {
        JavaBlog = javaBlog;
    }
}
