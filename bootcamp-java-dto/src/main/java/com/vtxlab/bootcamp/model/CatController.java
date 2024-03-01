package com.vtxlab.bootcamp.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatController {

  public Map<String, Integer> getCats() {
    
    CatService catService = new CatService();

    List<Cat> cats = catService.getCats();
    
    Map<String, Integer> catsMap = new HashMap<>();

    for (Cat c : cats) {
      catsMap.put(c.getName(), c.getAge());
    }

    return catsMap;
    

  }


  
}
