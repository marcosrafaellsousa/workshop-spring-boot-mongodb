package com.github.marcosrafaellsousa.workshopmongo.services;

import com.github.marcosrafaellsousa.workshopmongo.domain.Post;
import com.github.marcosrafaellsousa.workshopmongo.repository.PostRepository;
import com.github.marcosrafaellsousa.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;


    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.searchTitle(text);
    }

    public List<Post> completeSearch (String text, Date minDate, Date maxDate) {
        maxDate = new Date(maxDate.getTime() + 24 + 60 + 60 + 1000); //macete para comparar a data até o final do dia e não até um momento
        return repo.completeSearch(text, minDate, maxDate);
    }
}
