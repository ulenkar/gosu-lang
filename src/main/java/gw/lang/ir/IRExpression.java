package gw.lang.ir;

import gw.lang.UnstableAPI;

/**
 * NOTE:  This class is currently not a fixed part of the API and may change in future releases.
 *
 *  Copyright 2010 Guidewire Software, Inc.
 */
@UnstableAPI
public abstract class IRExpression extends IRElement {

  public abstract IRType getType();
  
}
