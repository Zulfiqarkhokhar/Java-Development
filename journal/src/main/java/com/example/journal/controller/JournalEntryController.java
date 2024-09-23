package com.example.journal.controller;

import com.example.journal.entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {


    private Map<Long, JournalEntity> entities = new HashMap<>();

    @GetMapping
    public List<JournalEntity> getAll(){
        return new ArrayList<>(entities.values());
    }

    @PostMapping
    public boolean addEntity(@RequestBody JournalEntity entity){
        entities.put(entity.getId(), entity);
        return true;
    }

    @GetMapping("/id/{myId}")
    public JournalEntity getEntityById(@PathVariable Long myId){
        return entities.get(myId);
    }

    @DeleteMapping("/id/{myId}")
    public boolean deleteEntityById(@PathVariable Long myId){
        entities.remove(myId);
        return true;
    }

    @PutMapping("/id/{myId}")
    public JournalEntity updateEntity(@PathVariable Long myId, @RequestBody JournalEntity entity){
        return entities.put(myId, entity);
    }

}
