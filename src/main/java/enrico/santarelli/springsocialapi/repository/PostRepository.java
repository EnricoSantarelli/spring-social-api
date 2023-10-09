package enrico.santarelli.springsocialapi.repository;

import org.springframework.data.repository.CrudRepository;

import enrico.santarelli.springsocialapi.model.Post;

public interface PostRepository extends CrudRepository<Post, Long> {}
