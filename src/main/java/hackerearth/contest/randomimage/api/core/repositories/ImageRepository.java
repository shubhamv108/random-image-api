package hackerearth.contest.randomimage.api.core.repositories;

import hackerearth.contest.randomimage.api.core.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
    Optional<Image> findByRequestId(String requestId);
}
