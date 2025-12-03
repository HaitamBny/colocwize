package com.mycoliving.adservice.Service.Impl;

import com.mycoliving.adservice.Domain.Entity.Room;
import com.mycoliving.adservice.Repository.RoomRepository;
import com.mycoliving.adservice.Service.IRoomService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RoomServiceImpl implements IRoomService {

    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Room> findById(Long id) {
        return roomRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room updateRoom(Room room) {
        Room existing = roomRepository.findById(room.getId())
                .orElseThrow(() -> new EntityNotFoundException("Room not found: " + room.getId()));

        existing.setArea(room.getArea());
        existing.setCapacity(room.getCapacity());
        existing.setAvailable(room.getAvailable());

        return roomRepository.save(existing);
    }

    @Override
    public void deleteRoom(Long id) {
        if (roomRepository.existsById(id)) roomRepository.deleteById(id);
        else throw new EntityNotFoundException("Room not found: " + id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Room> findByPropertyId(Long propertyId) {
        return roomRepository.findByPropertyId(propertyId);
    }
}
