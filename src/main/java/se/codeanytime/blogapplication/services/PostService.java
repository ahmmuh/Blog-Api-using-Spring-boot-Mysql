package se.codeanytime.blogapplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.codeanytime.blogapplication.models.Post;
import se.codeanytime.blogapplication.repositories.PostRepository;

import java.util.List;

@Service
public class PostService {
    final PostRepository postRepository;
    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void addPost(Post post){
        postRepository.save(post);
    }

    public List<Post> getPosts(){
        return postRepository.findAll();
    }
    public Post getPost(Long id){
        return postRepository.getById(id);
    }

    public Post updatePost(Post post){
        return postRepository.save(post);
    }

//    public void dletePost(Long id){
//        postRepository.deletePost(id);
//    }

}
