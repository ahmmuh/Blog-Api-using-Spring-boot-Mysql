package se.codeanytime.blogapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.codeanytime.blogapplication.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
//    void deletePost(Long id);
}
