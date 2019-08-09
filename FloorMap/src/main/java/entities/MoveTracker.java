package entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class MoveTracker {
    private Integer idMove;
    private Integer idVisitor;
    private Integer idRoom;
    private LocalDateTime timeStart;
    private LocalDateTime timeFinish;
}
