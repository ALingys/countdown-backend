package alingys.countdownbackend.countdown;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface CountdownRepository extends JpaRepository<Countdown, Long> {

    Optional<Countdown> findById(Long countdownId);

    List<Countdown> findAll();
}
