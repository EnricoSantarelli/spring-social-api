package enrico.santarelli.springsocialapi.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enrico.santarelli.springsocialapi.model.Post;
import enrico.santarelli.springsocialapi.repository.PostRepository;
import enrico.santarelli.springsocialapi.service.PostService;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public void createPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public List<Post> getAccountPosts(Long id) {
        List<Post> posts = new ArrayList<Post>();
        postRepository.findAll().forEach(
                (e) -> {
                    if (e.getAccountId() == id) {
                        posts.add(e);
                    }
                });
        ;
        return posts;
    }

    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

}
