package org.ict.demogitproject;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BbsController {

  private final IndexController indexController;
  public BbsController(IndexController indexController) {
    this.indexController = indexController;
  }

}
