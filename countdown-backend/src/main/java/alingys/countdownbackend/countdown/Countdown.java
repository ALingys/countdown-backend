package alingys.countdownbackend.countdown;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Table(name = "countdown")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Countdown {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "countdown_id", nullable = false)
    private Long countdownId;
    @Column(name = "countdown_name", nullable = false)
    private String countdownName;
    @Column(name = "countdown_date", nullable = false)
    private LocalDateTime countdownDate;
    @Column(name = "description")
    private String description;
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
