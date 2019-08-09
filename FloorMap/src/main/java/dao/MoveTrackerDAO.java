package dao;

import entities.MoveTracker;

import java.util.List;
import java.util.Optional;

public interface MoveTrackerDAO {
    void addMovement(MoveTracker movement);

    List<Optional<MoveTracker>> getByRoomId (Integer idRoom);

    List<Optional<MoveTracker>> getByVisitorId (Integer idVisitor);
}
