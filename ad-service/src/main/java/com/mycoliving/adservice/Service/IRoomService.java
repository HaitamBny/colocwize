package com.mycoliving.adservice.Service;

import com.mycoliving.adservice.Domain.Entity.Room;

import java.util.List;
import java.util.Optional;

public interface IRoomService {
    Room createRoom(Room room);
    Optional<Room> findById(Long id);
    List<Room> findAll();
    Room updateRoom(Room room);
    void deleteRoom(Long id);

    List<Room> findByPropertyId(Long propertyId);
}
