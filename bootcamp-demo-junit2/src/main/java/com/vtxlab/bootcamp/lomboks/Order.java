package com.vtxlab.bootcamp.lomboks;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Order {

  private boolean isOrdered;
  private boolean isPaid;
  private boolean isInventoryLocked;
  
  public boolean payment() {
    if(isOrdered) {
      isPaid = true;
      return true;
    }

    return false;
  }

  public boolean lockInventory() {
    if (isPaid) {
      isInventoryLocked = true;
      return true;
    }

    return false;
  }

  public boolean order() {
    isOrdered = true;
    return true;
  }

  public boolean placeOrder(List<String> items) {
    int count = 0;
    
    for (String item: items) 
      count++;
    
    return true;
  }
  
}
