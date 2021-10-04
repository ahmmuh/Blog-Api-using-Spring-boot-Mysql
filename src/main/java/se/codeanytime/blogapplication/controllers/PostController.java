package se.codeanytime.blogapplication.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.codeanytime.blogapplication.models.Post;
import se.codeanytime.blogapplication.services.PostService;

import java.util.List;

@RestController
public class PostController {

    private final PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("post/add")
    public ResponseEntity<?> addPost(@RequestBody Post post){
       postService.addPost(post);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getPosts(){
        List<Post> posts = postService.getPosts();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @GetMapping("/post/{id}")
    public ResponseEntity<Post> getPost(@PathVariable("id") Long id){
        Post post = postService.getPost(id);
        return new ResponseEntity<>(post,HttpStatus.OK);
    }

    @PutMapping("/post/{id}")
    public ResponseEntity<Post> updatePost(@RequestBody Post post){
        Post updatePost = postService.updatePost(post);
        return new ResponseEntity<>(updatePost,HttpStatus.OK);
    }

//    @DeleteMapping("/post/{id}")
//    public ResponseEntity<?> deletePost(@PathVariable("id") Long id){
//      postService.dletePost(id);
//      return new ResponseEntity<>(HttpStatus.OK);
//    }
}
