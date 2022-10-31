package acc.inzynierka.repository;

import acc.inzynierka.models.Level;
import acc.inzynierka.models.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LevelRepository extends JpaRepository<Level, Long> {
}
