package edu.vanderbilt.vuit.automation.ares.vuares.listener;

import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.Point;
import org.springframework.beans.factory.annotation.Value;

public class ResultSender {

//   @Value( "${db.username}" )
//   private static String userName;
//   @Value( "${db.password}" )
//   private static String password;
//
//   @Value( "${db.name}" )
//   private static String dbName;

   private static final InfluxDB INFLXUDB = InfluxDBFactory.connect("http://localhost:8086", "admin", "passw0rd" );

   static{
      INFLXUDB.setDatabase("selenium");
   }

   public static void send(final Point point){
      INFLXUDB.write(point);
   }
}