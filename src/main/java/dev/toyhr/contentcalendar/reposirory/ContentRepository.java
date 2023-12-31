package dev.toyhr.contentcalendar.reposirory;
import dev.toyhr.contentcalendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;
import java.util.List;


public interface ContentRepository extends ListCrudRepository<Content,Integer> {

    List<Content> findAllByTitleContains(String keyword);
}
