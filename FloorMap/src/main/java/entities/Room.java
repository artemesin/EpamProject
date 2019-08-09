package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Room {
    private Integer idRoom;
    private Integer idFloor;
    private String x1;
    private String y1;
    private String x2;
    private String y2;
}
