package com.vtxlab.bootcamp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;
import com.vtxlab.bootcamp.model.CatController;



public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        CatController catController = new CatController();

        Map<String, Integer> catMap = catController.getCats();
        
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(catMap);

        System.out.println(jsonString);

    }
}