package com.manning.hip.ch7;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

import java.io.IOException;

/**
 */
public class BadFunc extends EvalFunc<String> {

  public String exec(Tuple input) throws IOException {
    return "bob";
  }
}
