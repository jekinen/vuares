package edu.vanderbilt.vuit.automation.ares.vuares.ui.more.postive;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import edu.vanderbilt.vuit.automation.ares.vuares.listener.ExecutionListener;

@Listeners( ExecutionListener.class)
public class Test1 {

   @Test(description = "login")
   public void login(){

   }

   @Test(description = "search for flights", dependsOnMethods = "login")
   public void search(){

   }

   @Test(description = "select flight", dependsOnMethods = "search")
   public void select(){

   }

   @Test(description = "book flight", dependsOnMethods = "select")
   public void book(){

   }

   @Test(description = "logout", dependsOnMethods = "book")
   public void logout(){

   }
}
