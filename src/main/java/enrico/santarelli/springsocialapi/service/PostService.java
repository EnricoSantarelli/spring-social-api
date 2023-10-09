package enrico.santarelli.springsocialapi.service;

import java.util.List;

import enrico.santarelli.springsocialapi.model.Post;

public interface PostService {

    void createPost(Post post);
    List<Post> getAccountPosts(Long id);
    void deletePost(Long id);
}
