/*
 * Copyright (c) 1995-2013, Index Datassss
 * All rights reserved.
 * See the file LICENSE for details.
 */
package org.yaz4j;

import org.yaz4j.jni.yaz4jlib;

/**
 *
 * @author jakub
 */
public class PrefixQuery extends Query {

  public PrefixQuery(String prefixQuery) {
    super();
    yaz4jlib.ZOOM_query_prefix(query, prefixQuery);
  }
  
}
