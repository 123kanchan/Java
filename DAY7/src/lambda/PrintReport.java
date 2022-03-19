package lambda;
//it is functional interface and can be used as a functionla interface
@FunctionalInterface//this annotatiion ensure of sam interface
public interface PrintReport {

public void produceReport(String val);
//public void Ereport();//will give error in lambda functional because only 1 method
//if want error in sam einterface for more than one maethod

}
