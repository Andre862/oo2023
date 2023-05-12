import ee.andre.kontrolltoo2.Toode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface ToodeRepository extends JpaRepository<Toode,Long> {
    Toode findByNimetus(String nimetus);

    List<Toode> findByTootenimekiriIsBetween(String tootenimekiri);
}
