package com.manning.hip.ch3.avro.gen;

@SuppressWarnings("all")
public interface Simple {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"Simple\",\"namespace\":\"com.manning.hip.ch3.avro.gen\",\"types\":[{\"type\":\"record\",\"name\":\"Stock\",\"fields\":[{\"name\":\"symbol\",\"type\":\"string\"},{\"name\":\"date\",\"type\":\"string\"},{\"name\":\"open\",\"type\":\"double\"},{\"name\":\"high\",\"type\":\"double\"},{\"name\":\"low\",\"type\":\"double\"},{\"name\":\"close\",\"type\":\"double\"},{\"name\":\"volume\",\"type\":\"int\"},{\"name\":\"adjClose\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"StockAvg\",\"fields\":[{\"name\":\"symbol\",\"type\":\"string\"},{\"name\":\"avg\",\"type\":\"double\"}]}],\"messages\":{}}");
}
