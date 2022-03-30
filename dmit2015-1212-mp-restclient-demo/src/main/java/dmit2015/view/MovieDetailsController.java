package dmit2015.view;



import dmit2015.restclient.Movie;
import dmit2015.restclient.MovieService;
import jakarta.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

import jakarta.annotation.PostConstruct;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.omnifaces.util.Faces;

import java.io.Serial;
import java.io.Serializable;
import java.util.Optional;

@Named("currentMovieDetailsController")
@RequestScoped
public class MovieDetailsController {
    private static final long serialVersionUID = 1L;

    @Inject
    private MovieService _movieService;

    @Inject
    @ManagedProperty("#{param.editId}")
    @Getter
    @Setter
    private String editId;

    @Getter
    private Movie existingMovie;

    @PostConstruct
    public void init() {
        Movie optionalMovie = _movieService.findbyId(editId);

    }
}