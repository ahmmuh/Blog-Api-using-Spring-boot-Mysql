package se.codeanytime.blogapplication.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Post {
    @Id
    private Long id;
    private String title;
    private String description;
    private LocalDate localDate;

    @ManyToOne
    private User user;
    public Post() {
    }

    public Post(User user) {
        this.user = user;
    }

    public Post(Long id, String title, String description, LocalDate localDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.localDate = localDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
