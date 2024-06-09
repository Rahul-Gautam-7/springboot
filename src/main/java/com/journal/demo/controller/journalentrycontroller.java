package com.journal.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.journal.demo.entry.journalentry;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/journal")
public class journalentrycontroller {

    private Map<Long ,journalentry> journalentries = new HashMap<>();


        @GetMapping
        public List<journalentry> getAll(){

            return new ArrayList<>(journalentries.values());

        }

        @PostMapping
        public boolean create(@RequestBody journalentry myjournal) {
            journalentries.put(myjournal.getId(), myjournal);
            return true;
        }
        @GetMapping("id/{myId}")
        public journalentry getjournalid(@PathVariable Long myId) {
            return journalentries.get(myId);
        }
        
        @DeleteMapping("id/{myId}")
        public journalentry deleteMethodName(@PathVariable Long myId) {
            return journalentries.remove(myId);
        }

        @PutMapping("id/{id}")
        public journalentry putMethodName(@PathVariable Long id, @RequestBody journalentry myjournal) {

            return journalentries.put(id, myjournal);
        }

        
        

        
        
    
}
