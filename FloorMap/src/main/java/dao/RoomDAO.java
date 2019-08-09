package dao;

import entities.Room;

import java.util.List;

public interface RoomDAO {
    List<Room> getAllRooms();

    void addRoom(Room room);
}
