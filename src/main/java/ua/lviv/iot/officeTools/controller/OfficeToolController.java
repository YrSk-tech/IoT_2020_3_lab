package ua.lviv.iot.officeTools.controller;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ua.lviv.iot.officeTools.model.OfficeTool;

@RequestMapping("/officetool")
@RestController
public class OfficeToolController {
    private static Map<Integer, OfficeTool> officeToolStorage = new HashMap<>();

    private static AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<OfficeTool> getOfficeTool() {
        return new LinkedList<OfficeTool>(officeToolStorage.values());
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<OfficeTool> getPartOfOfficeTool(final @PathVariable("id") Integer OfficeToolId,
            final @RequestBody OfficeTool officetool) {
        officetool.setId(OfficeToolId);
        if (officeToolStorage.containsKey(OfficeToolId) ) {
            return ResponseEntity.ok(officeToolStorage.put(OfficeToolId, officetool));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = { "/{id}" })
    public ResponseEntity<OfficeTool> deleteOfficeTool(final @PathVariable("id") Integer OfficeToolId) {
        HttpStatus status = officeToolStorage.remove(OfficeToolId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();

    }
    
    @PutMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public OfficeTool createOfficeTool(final @RequestBody OfficeTool officeTool) {
        officeTool.setId(idCounter.incrementAndGet());
        officeToolStorage.put(officeTool.getId(), officeTool);
        return officeTool; 
    }
}