package alingys.countdownbackend.countdown;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CountdownService {
    private final CountdownRepository countdownRepository;

    public Countdown findById(Long countdownId){
        return countdownRepository.findById(countdownId).
                orElseThrow(() -> new EntityNotFoundException("Countdown not found with id: " + countdownId));
    }

    public List<Countdown> findAll() {
        return countdownRepository.findAll();
    }

    public Countdown createCountdown(Countdown countdown){
        return countdownRepository.save(countdown);
    }



}
