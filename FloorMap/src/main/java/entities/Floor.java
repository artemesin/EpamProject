package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Floor {
    private Integer idFloor;
    private String maxXSize;
    private String maxYSize;
}
