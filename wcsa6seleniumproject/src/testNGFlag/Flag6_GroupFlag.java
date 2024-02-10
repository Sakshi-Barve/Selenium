package testNGFlag;
import org.testng.annotations.Test;

public class Flag6_GroupFlag {
  @Test(groups = "Functional TC")
  public void fT1() 
  {
	  System.out.println("Functional TC1");
  }
  @Test(groups = "Integration TC")
  public void iT1()
  {
	  System.out.println("Integration TC1");
  }
  @Test(groups = "Smoke TC")
  public void sT1()
  {
	  System.out.println("Smoke TC1");
  }
  
  //----------------------------------------------------
  
  @Test(groups = "Functional TC")
  public void fT2() 
  {
	  System.out.println("Functional TC2");
  }
  @Test(groups = "Integration TC")
  public void iT2()
  {
	  System.out.println("Integration TC2");
  }
  @Test(groups = "Smoke TC")
  public void sT2()
  {
	  System.out.println("Smoke TC2");
  }
  
  //-------------------------------------------------
  @Test(groups = "Functional TC")
  public void fT3() 
  {
	  System.out.println("Functional TC3");
  }
  @Test(groups = "Integration TC")
  public void iT3()
  {
	  System.out.println("Integration TC3");
  }
  @Test(groups = "Smoke TC")
  public void sT3()
  {
	  System.out.println("Smoke TC3");
  }
  
  //-----------------------------------------------------
  @Test(groups = "Functional TC")
  public void fT4() 
  {
	  System.out.println("Functional TC4");
  }
  @Test(groups = "Integration TC")
  public void iT4()
  {
	  System.out.println("Integration TC4");
  }
  @Test(groups = "Smoke TC")
  public void sT4()
  {
	  System.out.println("Smoke TC4");
  }
  
  
  //---------------------------------------------------
  @Test(groups = "Functional TC")
  public void fT5() 
  {
	  System.out.println("Functional TC5");
  }
  @Test(groups = "Integration TC")
  public void iT5()
  {
	  System.out.println("Integration TC5");
  }
  @Test(groups = "Smoke TC")
  public void sT5()
  {
	  System.out.println("Smoke TC5");
  }
  
  //-------------------------------------------------------
  @Test(groups = "Functional TC")
  public void fT6() 
  {
	  System.out.println("Functional TC6");
  }
  @Test(groups = "Integration TC")
  public void iT6()
  {
	  System.out.println("Integration TC6");
  }
  @Test(groups = "Smoke TC")
  public void sT6()
  {
	  System.out.println("Smoke TC6");
  }
}
