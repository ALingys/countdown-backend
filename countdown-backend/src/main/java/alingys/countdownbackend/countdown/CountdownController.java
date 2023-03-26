package alingys.countdownbackend.countdown;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/countdown")
public class CountdownController {
    private final CountdownService countdownService;

    @GetMapping("/")
    public List<Countdown> findAll(){
        log.info("CountdownController.findAll..");
        return countdownService.findAll();
    }

    @GetMapping("/{id}")
    public Countdown findById(@PathVariable("id") Long countdownId){
        log.info("CountdownController.findById..: {}", countdownId);
        return countdownService.findById(countdownId);
    }

    @PostMapping("/")
    public Countdown createCountdown(@RequestBody Countdown countdown){
        log.info("createCountdown..: {}", countdown );
        return countdownService.createCountdown(countdown);
    }

}
