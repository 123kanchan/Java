package day2;

import java.time.LocalDate;

//book author code demonstration
public class bookapp4 {
public static void main(String[]args)
{
	book b1 = new book();
	b1.setId(1111);
	b1.setTitle("Tao of physics");
	b1.setDateOfPublishing(LocalDate.of(2000, 3, 13));
	b1.setPrice(340);

	
	book b2= new book(1123,"Mastering AWS",LocalDate.of(2016, 4, 13),290);
	
	
    System.out.println(b1);
   
    System.out.println(b2);
    System.out.println(book.getCtr());
	
    
    b1.setAu(new Author());
 b1.au.setEmail("abc@gmail.com");   
  System.out.println(b1.au.getEmail());

}}
