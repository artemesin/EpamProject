package dao;

import entities.Floor;

import java.util.List;

public interface FloorDAO {
    List<Floor> getAllFloors();

    void addFloor(Floor floor);
}
